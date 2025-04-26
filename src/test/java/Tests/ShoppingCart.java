package Tests;

import Pages.HomePage_Locators;
import Pages.LoginPage_Locators;
import Pages.RegisterPage_Locators;
import Pages.ShoppingCart_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingCart extends Testbase{
    HomePage_Locators homePageLocators;
    LoginPage_Locators loginPageLocators;
    RegisterPage_Locators registerLocators;
    ShoppingCart_Locators shoppingCartLocators;


    @BeforeClass
    public void StartTest ()
    {
        homePageLocators = new HomePage_Locators(driver);
        loginPageLocators  = new LoginPage_Locators(driver);
        registerLocators= new RegisterPage_Locators(driver);
        shoppingCartLocators = new ShoppingCart_Locators(driver);
    }

    @Test
    public void ClearCart() throws InterruptedException {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        homePageLocators.ClickMyAccount();
        homePageLocators.Login();
        loginPageLocators.EnterEMail();
        loginPageLocators.EnterPassword();
        loginPageLocators.ClickLoginBTN();
        Thread.sleep(2000);
        homePageLocators.Home();
        Thread.sleep(2000);
        homePageLocators.ClickAddToCart();
       Thread.sleep(2000);
        shoppingCartLocators.ClickShoppingCart();
        Thread.sleep(2000);
        shoppingCartLocators.ClickRemoveButton();
        Thread.sleep(2000);
       Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div/p")).isDisplayed());

    }
    }