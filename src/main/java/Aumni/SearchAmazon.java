package Aumni;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;



public class SearchAmazon {

    public static void main(String[] args) {

        String url = "https://www.amazon.in/";
        String search = "samsung mobile phone";

        amazonVisit(url, search);
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

        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search);
        driver.findElement(By.id("nav-search-submit-button")).click();

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
