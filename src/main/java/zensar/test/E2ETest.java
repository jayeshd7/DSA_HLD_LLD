package zensar.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import zensar.main.pages.LoginPages;

/*
    * Created by Jayesh Dalal
    * using testing & TDD approach
    *
    * CI can use this test to run the test : with tag like smoke and regression
    * mvn test -Dgroups="smoke"
    * mvn test -Dgroups="regression"
    *
    * using POM design pattern for segregating the code with page factory
    *


 */

public class E2ETest {

    WebDriver driver;

    LoginPages loginPages = new LoginPages(driver);



   @BeforeTest(alwaysRun = true)
    public void setup() {

        loginPages.openBrowser("http://eqaroloflow.co.za/wp/");
       }

    @Test (description = "Login Test", groups = {"smoke", "regression"}, priority = 1)
    public void E2ETest() {
        loginPages.clickMyAccount(driver);
        loginPages.loginFromMyAccount(driver);
        loginPages.shopIcon(driver);
        loginPages.orderSeaFoodPizza(driver);
        loginPages.checkout(driver);
        String orderNumber = loginPages.getOrderNumber(driver);
        Assert.assertNotNull(orderNumber, "Order number is not null");
        Assert.assertTrue(orderNumber.contains("ORDER NUMBER:"));
        // actually printed order number - ORDER NUMBER: 972
        System.out.println("Order number - " + orderNumber);

    }


    @AfterTest(alwaysRun = true)
    public void tearDown() {
        loginPages.closeBrowser();
    }


}
