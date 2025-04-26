package Tests;

import Pages.HomePage_Locators;
import Pages.LoginPage_Locators;
import Pages.RegisterPage_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPage extends Testbase {
    HomePage_Locators homePageLocators;
    LoginPage_Locators loginPageLocators;
    RegisterPage_Locators registerLocators;
    SoftAssert softAssert = new SoftAssert();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @BeforeClass
    public void StartTest ()
    {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        homePageLocators = new HomePage_Locators(driver);
        loginPageLocators  = new LoginPage_Locators(driver);
        registerLocators= new RegisterPage_Locators(driver);
    }


    @Test //TC04
    public void User_Can_not_Register_Successfully () throws InterruptedException {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        homePageLocators.ClickMyAccount();
        homePageLocators.RegisterButton();
        registerLocators.EnterBlankFirstName();
        registerLocators.EnterBlankLastName();
        registerLocators.EnterInvalidEmail();
        registerLocators.EnterInvalidTelephone();
        registerLocators.EnterInvalidPassword();
        registerLocators.EnterInvalidConfirm();
        registerLocators.DoNotClickCheckBox();
        registerLocators.ClickContinueButton();
        String privacyWarning = driver.findElement(By.cssSelector(".alert-danger")).getText();
        Assert.assertTrue(privacyWarning.contains("You must agree to the Privacy Policy!"));
        String firstNameError = driver.findElement(By.xpath("//input[@name='firstname']/following-sibling::div")).getText();
        Assert.assertEquals(firstNameError, "First Name must be between 1 and 32 characters!");
        String lastNameError = driver.findElement(By.xpath("//input[@name='lastname']/following-sibling::div")).getText();
        Assert.assertEquals(lastNameError, "Last Name must be between 1 and 32 characters!");
        String emailError = driver.findElement(By.xpath("//input[@name='email']/following-sibling::div")).getText();
        Assert.assertEquals(emailError, "E-Mail Address does not appear to be valid!");
        String passwordError = driver.findElement(By.xpath("//input[@name='password']/following-sibling::div")).getText();
        Assert.assertEquals(passwordError, "Password must be between 4 and 20 characters!");
        String confirmPasswordError = driver.findElement(By.xpath("//input[@name='confirm']/following-sibling::div")).getText();
        Assert.assertEquals(confirmPasswordError, "Password confirmation does not match password!");
        Thread.sleep(2000);
    }
    @Test //TC03
    public void User_Can_Register_Successfully ()
    {
    driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
    homePageLocators.ClickMyAccount();
    homePageLocators.RegisterButton();
    registerLocators.EnterFirstName();
    registerLocators.EnterLastName();
    registerLocators.EnterEmail();
    registerLocators.EnterTelephone();
    registerLocators.EnterPassword();
    registerLocators.ReEnterPassword();
    registerLocators.ClickCheckBox();
    registerLocators.ClickContinueButton();
    Assert.assertTrue(driver.findElement(By.id("content")).isDisplayed());
    homePageLocators.ClickMyAccount();
    homePageLocators.ClickLogout();
    }



}

