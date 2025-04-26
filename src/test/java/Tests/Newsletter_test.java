package Tests;

import Pages.Newsletter_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Newsletter_test extends Testbase{
    Newsletter_page newsletterPage_object;
    SoftAssert softAssert_object = new SoftAssert();

    @BeforeClass
    public void before_Newsletter() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        newsletterPage_object = new Newsletter_page(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
    }
    @Test
    public void subscribe_newsletter(){
        newsletterPage_object.login_Newsletter();
        newsletterPage_object.Newsletter_navigate();
        newsletterPage_object.subscribe();
        Assert.assertTrue(driver.findElement(By.cssSelector("div.alert.alert-success")).isDisplayed());

    }

}
