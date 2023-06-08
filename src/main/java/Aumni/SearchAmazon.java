package Aumni;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v111.fetch.Fetch;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Optional;


public class SearchAmazon {

    public static void main(String[] args) {

        String url = "https://www.amazon.in/";
        String search = "samsung mobile phone";

        //amazonVisit(url, search);
        
        yatraVisit("https://www.yatra.com/");
    }

    private static void yatraVisit(String url) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS);

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        List<WebElement> elements = driver.findElements(By.xpath("(//ul[@class='be-tabs-snipe clearfix'])/li/a[@title]"));
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
        driver.close();
    }

    public void devToolConcept() {
        WebDriver driver = new ChromeDriver();
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
        devTools.addListener(Fetch.requestPaused(), req -> {
            if(req.getRequest().getUrl().contains("google-analytics.com")){
               String mock = req.getRequest().getUrl().replace("google-analytics.com", "google-analytics.com");
               devTools.send(Fetch.continueRequest(req.getRequestId(), Optional.of(mock), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));

        }
            else {
                devTools.send(Fetch.continueRequest(req.getRequestId(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
            }
        });
    }
    public void testSetup() throws MalformedURLException {
        String node = "http://localhost:4444";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("latest");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        WebDriver driver = new RemoteWebDriver(new URL(node), capabilities);
    }
    private static void amazonVisit(String url, String search) {
        WebDriver driver = new ChromeDriver();
        //Grid setup

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS);

        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search);
        driver.findElement(By.id("nav-search-submit-button")).submit();

        driver.findElement(By.xpath("//input[@id='low-price']")).sendKeys("1000");
        driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("1500");
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();

        List<WebElement> elements = driver.findElements(By.className("a-size-medium a-color-base a-text-normal"));
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }


        driver.close();


    }
}
