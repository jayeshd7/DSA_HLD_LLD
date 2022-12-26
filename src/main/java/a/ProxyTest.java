package a;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.events.DomMutationEvent;
import org.openqa.selenium.devtools.v102.performance.Performance;
import org.openqa.selenium.devtools.v102.performance.model.Metric;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.virtualauthenticator.Credential;
import org.openqa.selenium.virtualauthenticator.VirtualAuthenticator;
import org.openqa.selenium.virtualauthenticator.VirtualAuthenticatorOptions;

import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import static org.openqa.selenium.devtools.events.CdpEventTypes.domMutation;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ProxyTest {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        performanceMetricsExample();
        devTools();
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("localhost:8080");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("proxy", proxy);
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Boolean element = new WebDriverWait(driver, Duration.ofSeconds(100)).until(a ->
            driver.getTitle().toLowerCase().startsWith("google")
        );

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(a -> {
            return driver.findElement(By.id("foo"));
        });

        driver.getTitle();
        driver.manage().addCookie(new Cookie("foo", "bar"));
        Cookie foo1 = driver.manage().getCookieNamed("foo");
        System.out.println(foo1);

        // print all cookies

        driver.manage().getCookies().forEach(System.out::println);
        driver.manage().deleteAllCookies();

        driver.manage().window().maximize();
        driver.quit();

        relativeLocators(driver, new WebDriverWait(driver, Duration.ofSeconds(100)));

        mutatationObserver();


    }


    private static void devTools() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Log.enable());
        devTools.getCdpSession();
        devTools.addListener(Log.entryAdded(), logEntry -> System.out.println("logs are " +logEntry.getText()));
        driver.get("https://saucelabs.com");
    // Check the terminal output for the browser console messages.
        driver.quit();
    }

    public static void performanceMetricsExample() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Performance.enable(Optional.empty()));
        List<Metric> metricList = devTools.send(Performance.getMetrics());

        driver.get("https://google.com");
        driver.quit();

        for(Metric m : metricList) {
            System.out.println("metrices for this test are" + m.getName() + " = " + m.getValue());
        }
    }

    private static void mutatationObserver() {
        ChromeDriver chromeDriver = new ChromeDriver();
        AtomicReference<DomMutationEvent> seen = new AtomicReference<>();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        chromeDriver.onLogEvent(domMutation(mutation -> {
            seen.set(mutation);
            countDownLatch.countDown();
        }));
        chromeDriver.get("https://www.google.com");
        WebElement span = chromeDriver.findElement(By.cssSelector("span"));
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        js.executeScript("arguments[0].setAttribute('foo', 'bar')", span);



    }

    private static void relativeLocators(WebDriver driver, WebDriverWait wait) throws NoSuchAlgorithmException {

        WebElement password = driver.findElement(By.xpath("//div[@id='password']"));
        WebElement userName = driver.findElement(with(By.tagName("input")).above(password));
        WebElement cancelButton = driver.findElement(with(By.tagName("button")).toLeftOf(password));

        // near api
        /*
        near is helpful when we need to find an element that is at most 50px away from the specified element. In this case, we would like to find the email address field by first finding the label of that field.
         */

        WebElement userNameLabel = driver.findElement(By.id("username-label"));
        WebElement userNameField = driver.findElement(with(By.tagName("input")).near(userNameLabel));

        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        // Alerts

        driver.findElement(By.id("alert")).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        alert.accept();

        // iframe

        WebElement iframe = driver.findElement(By.cssSelector("iframe[name='iframe']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.id("iframe1")).click();
        driver.switchTo().defaultContent();

        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        for (WebElement frame : frames) {
            if (frame.getText().contains("iframe")) {
                driver.switchTo().frame(frame);
                driver.findElement(By.id("iframe1")).click();
                driver.switchTo().defaultContent();
            } else {
                driver.switchTo().frame(frame);
                driver.findElement(By.id("iframe")).click();
                driver.switchTo().defaultContent();
            }
        }

        driver.switchTo().frame(0);
    // windows api

        String windowHandle = driver.getWindowHandle();
        for(String handle : driver.getWindowHandles()){
            if(!handle.equals(windowHandle)){
                driver.switchTo().window(handle);
            }
            driver.switchTo().window(handle);
        }
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.close();

        Dimension size = driver.manage().window().getSize();
        size.getHeight();size.getWidth();


        // print page
        driver.get("https://www.google.com");

        ChromeDriver printer = (ChromeDriver) driver;
        PrintOptions printOptions = new PrintOptions();
        printOptions.setPageRanges("1-2");

        Pdf pdf = printer.print(printOptions);
        String content = pdf.getContent();
        System.out.println(content);

        // virtual authenticator

        VirtualAuthenticatorOptions options = new VirtualAuthenticatorOptions()
                .setProtocol(VirtualAuthenticatorOptions.Protocol.valueOf("u2f"))
                .setTransport(VirtualAuthenticatorOptions.Transport.valueOf("usb"))
                .setHasResidentKey(true)
                .setHasUserVerification(true)
                .setIsUserConsenting(true)
                .setIsUserVerified(true);

        VirtualAuthenticator authenticator = ((ChromeDriver) driver).addVirtualAuthenticator(options);
        // key gen
        String algorithm = "RSA";
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance(algorithm);
        keyGen.initialize(1024);/*from   w  ww . j  a va  2 s  .com*/
        KeyPair keypair = keyGen.genKeyPair();
        PrivateKey privateKey = keypair.getPrivate();
        PublicKey publicKey = keypair.getPublic();


        byte[] privateKeyBytes = privateKey.getEncoded();
        authenticator.addCredential(Credential.createResidentCredential("".getBytes(), "privateKey",new PKCS8EncodedKeySpec(privateKeyBytes),"".getBytes(),1));


        // actions api
        WebElement clickable = driver.findElement(By.id("clickable"));
        new Actions(driver)
                .setActivePointer(PointerInput.Kind.PEN,"pen")
                .moveToElement(clickable)
                .pause(Duration.ofSeconds(5))
                .click(clickable)
                .pause(Duration.ofSeconds(5))
                .sendKeys(Keys.ENTER)
                .pause(Duration.ofSeconds(5))
                .sendKeys(Keys.chord(Keys.CONTROL, "a"))
                .pause(Duration.ofSeconds(5))
                .clickAndHold(clickable)
                .perform();



    }
}
