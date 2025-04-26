package Tests;

import Pages.HomePage_Locators;
import Pages.LoginPage_Locators;
import Pages.RegisterPage_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class HomePage extends Testbase{
    HomePage_Locators homePageLocators;
    LoginPage_Locators loginPageLocators;
    RegisterPage_Locators registerLocators;
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void StartTest ()
    {
        homePageLocators = new HomePage_Locators(driver);
        loginPageLocators  = new LoginPage_Locators(driver);
        registerLocators= new RegisterPage_Locators(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        homePageLocators.ClickMyAccount();
        homePageLocators.Login();
        loginPageLocators.EnterEMail();
        loginPageLocators.EnterPassword();
        loginPageLocators.ClickLoginBTN();
    }

    @Test //TC01
    public void Logged_Users_Could_Select_Different_categories() throws InterruptedException {
    Thread.sleep(2000);
    homePageLocators.DesktopCategory();
    Thread.sleep(2000);
    softAssert.assertTrue(driver.findElement(By.className("see-all")).isDisplayed());
    softAssert.assertAll();
        driver.quit();

    }
    @Test //TC02
    public void Logged_UsersCould_Search_For_Any_Product()
    {
        homePageLocators.ClickSearchBar();
        softAssert.assertTrue(driver.findElement(By.linkText("iPhone")).isDisplayed());
        softAssert.assertAll();

    }



}
