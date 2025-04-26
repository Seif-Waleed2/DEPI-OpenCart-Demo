package Tests;

import Pages.LoginLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTesting extends Testbase{
    LoginLocator Login_locator_object;
    @BeforeClass
    public void preCondition() {
        Login_locator_object = new LoginLocator(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
    }

    @Test
    //TC 01 valid email and valid password

    public void validLogIn() {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        Login_locator_object.clickMyAccount();
        Login_locator_object.Login();
        Login_locator_object.enterEmail("test@depi.com");
        Login_locator_object.EnterPassword("1234");
        Login_locator_object.clickLogin();
        Assert.assertTrue(driver.findElement(
                By.xpath("//*[text()='My Account']")).isDisplayed());

    }

    @Test
    // TC 02 valid email and in valid password
    public void invalidCredential() {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        Login_locator_object.clickMyAccount();
        Login_locator_object.Login();
        Login_locator_object.enterEmail("test@depi.com");
        Login_locator_object.EnterPassword("256");
        Login_locator_object.clickLogin();
        //Assert.assertTrue(driver.findElement(By.xpath("//*[text()='alert alert-danger alert-dismissible']")).isDisplayed());

    }

    @Test
    // TC 0 3 invalid email and valid password
    public void invalidEmail() {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        Login_locator_object.clickMyAccount();
        Login_locator_object.Login();
        Login_locator_object.enterEmail("tom@depi.com");
        Login_locator_object.EnterPassword("1234");
        Login_locator_object.clickLogin();
    }
    
}




















/*driver.findElement(By.xpath("//span[text()='My Account']")).click();
driver.findElement(By.linkText("Login")).click();
driver.findElement(By.id("input-email")).sendKeys("test@depi.com");
driver.findElement(By.id("input-password")).sendKeys("1234");

    driver.findElement(By.cssSelector("btn btn-primary")).click();
    driver.quit();*/


















