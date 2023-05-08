package zensar.main.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPages extends BasePage{
    WebDriver driver;
    BasePage basePage = new BasePage(driver);

    @FindBy(xpath="//input[@id='username']")
    private String username;

    @FindBy(xpath = "//input[@id='password']")
    private String password;

    @FindBy(xpath = "//span[normalize-space()='My account']")
    private String myAccount;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private String loginButton;


    @FindBy(xpath = "//a[normalize-space()='Shop']")
    private String shopIcon;

    @FindBy(xpath = "//img[@alt='Pizza']")
    private String pizzaImage;

    @FindBy(xpath="//a[@aria-label='Add “Seafood Pizza” to your cart']")
    private String seafoodPizza;


    public LoginPages(WebDriver driver) {
        super(driver);
    }

    public LoginPages init() {
        PageFactory.initElements(driver, this);
        return this;
    }

    public void clickMyAccount(WebDriver driver) {
        LoginPages loginPages = new LoginPages(driver);
        loginPages.init();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(myAccount))).isDisplayed();
        driver.findElement(By.xpath(myAccount)).click();

    }


    public void loginFromMyAccount(WebDriver driver){
        driver.findElement(By.xpath(username)).sendKeys(basePage.getUserName());
        driver.findElement(By.xpath(password)).sendKeys(basePage.getPassword());
        driver.findElement(By.xpath(loginButton)).click();

    }

    public void shopIcon(WebDriver driver) {
        driver.findElement(By.xpath(shopIcon)).click();
        driver.findElement(By.xpath(pizzaImage)).click();
    }

    public void orderSeaFoodPizza(WebDriver driver) {
        driver.findElement(By.xpath(seafoodPizza)).click();

    }

    public void checkout(WebDriver driver) {
        driver.findElement(By.xpath("//a[normalize-space()='Proceed to checkout']")).click();
        driver.findElement(By.xpath("//button[@id='place_order']")).click();
    }

    public String getOrderNumber(WebDriver driver) {
        String OrderNumber = driver.findElement(By.xpath("//li[@class='woocommerce-order-overview__order order']")).getText();
        return OrderNumber;
    }



}
