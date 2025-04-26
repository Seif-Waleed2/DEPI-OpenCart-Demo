package Tests;

import Pages.wishlist_compare_page;
import com.aventstack.extentreports.reporter.ExtentReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class wishlist_compare_test  extends Testbase{
    wishlist_compare_page wishlist_page_object;
    SoftAssert softAssert_object = new SoftAssert();
    @BeforeClass
    public void before_wishlist_compare(){
        wishlist_page_object = new wishlist_compare_page(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        wishlist_page_object.login_page();
    }

    @Test
    public void  Add_to_wishlist () {
        test = extent.createTest("Add_to_wishlist");
        wishlist_page_object.selsct_iteam();
        test.info("Item selected");
        wishlist_page_object.addwishlist();
        test.info("Item has been added to wishlist");
        wishlist_page_object.navigate_to_wishlist();
        softAssert_object.assertTrue(driver.findElement(By.linkText("Apple Cinema 30\"")).isDisplayed());
        softAssert_object.assertAll();
        test.pass("Wishlist item verified");

    }
    @Test
    public void Add_to_compare(){
        test = extent.createTest("Add_to_compare");
        wishlist_page_object.selsct_iteam();
        test.info("Item selected");
        wishlist_page_object.addcompare1();
        softAssert_object.assertTrue(driver.findElement(By.id("compare-total")).isDisplayed());
        test.info("Item add to compare list");
        wishlist_page_object.addcompare2();
        wishlist_page_object.navigate_to_comparison();
        test.info("Second Item add to compare list");
        softAssert_object.assertTrue(driver.findElement(By.linkText("Apple Cinema 30\"")).isDisplayed());
        softAssert_object.assertTrue(driver.findElement(By.linkText("Samsung SyncMaster 941BW")).isDisplayed());
        test.pass("Comparison verified");
        softAssert_object.assertAll();


    }

}
