package Tests;

import Pages.order_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class order_test extends Testbase {
    order_page order_page_object;
    SoftAssert softAssert_object = new SoftAssert();
    @BeforeClass
    public void before_order(){
        order_page_object =new order_page(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        order_page_object.login_order();
        order_page_object.selsct_iteam1();
        order_page_object.add_to_cart();
        order_page_object.navigate_to_cart();
    }

    @Test
    public void Add_cart(){
        softAssert_object.assertTrue(driver.findElement(By.linkText("iMac")).isDisplayed());
        softAssert_object.assertAll();
    }
    @Test
    public void order() throws InterruptedException {
        order_page_object.checkout_btn();
        Thread.sleep(3000);
        order_page_object.payment_address_btn();
        Thread.sleep(1000);
        order_page_object.shipping_address_btn();
        Thread.sleep(1000);
        order_page_object.shipping_method_btn();
        Thread.sleep(1000);
        order_page_object.Terms_Conditions_checkbox();
        order_page_object.payment_method_btn();
        Thread.sleep(1000);
        order_page_object.confirm_method_btn();
        softAssert_object.assertTrue(driver.findElement(By.xpath("//div[@id='content']/h1")).isDisplayed());
        softAssert_object.assertAll();


    }
    @AfterClass
    public void quit () throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }



}
