package Tests;

import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReturnsPage extends Testbase{
        HomePage_Locators homePageLocators;
        LoginPage_Locators loginPageLocators;
        ReturnPage_Locators returnPageLocators;
        @BeforeClass
        public void StartTest() {
            homePageLocators = new HomePage_Locators(driver);
            loginPageLocators = new LoginPage_Locators(driver);
            returnPageLocators= new ReturnPage_Locators(driver);
        }


        @Test
    public void LoggedUserCanCreateReturnRequest() throws InterruptedException {
            driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
            homePageLocators.ClickMyAccount();
            homePageLocators.Login();
            loginPageLocators.EnterEMail();
            loginPageLocators.EnterPassword();
            loginPageLocators.ClickLoginBTN();
            Thread.sleep(2000);
            returnPageLocators.ClickReturns();
            Thread.sleep(2000);
            returnPageLocators.EnterOrderId();
            Thread.sleep(2000);
            returnPageLocators.EnterOrderDate();
            returnPageLocators.EnterProductName();
            returnPageLocators.EnterProductCode();
            returnPageLocators.EnterProductQuantity();
            returnPageLocators.SelectReturnReason();
            returnPageLocators.SelectProductStatus();
            returnPageLocators.ClickContinueButton();
            Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Product Returns']/following-sibling::p[1]")).isDisplayed());
        }
    }
