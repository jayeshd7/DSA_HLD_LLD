package zensar.main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BasePage {

    Properties properties = new Properties();

    WebDriver driver ;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openBrowser(String url){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public String getUserName() {

        return properties.getProperty("User");



    }
    public String getPassword() {

        return properties.getProperty("Password");



    }



}
