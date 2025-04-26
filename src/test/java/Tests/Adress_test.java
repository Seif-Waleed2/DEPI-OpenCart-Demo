package Tests;

import Pages.Adress_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class Adress_test extends Testbase {
    Adress_page adress_Page_object;
    SoftAssert softAssert_object = new SoftAssert();
    @BeforeClass
    public void before_Adress(){
        adress_Page_object = new Adress_page(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        adress_Page_object.login_Adress();
        adress_Page_object.navigate_to_Adresspage();
    }
    @Test(priority = 0)
    public void Delete_default_address() throws AWTException {
        adress_Page_object.delete();
        adress_Page_object.ok();
        Assert.assertTrue(driver.findElement(By.className("alert-warning")).isDisplayed());
    }
    @Test(priority = 1)
    public void Add_newadress() throws InterruptedException {
        adress_Page_object.New_Adress();
        adress_Page_object.Address_Information();
        Assert.assertTrue(driver.findElement(By.cssSelector("div.alert.alert-success")).isDisplayed());
    }

}
