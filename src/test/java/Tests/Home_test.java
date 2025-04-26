package Tests;
import Pages.Home_page;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Home_test extends Testbase {
    Home_page home_page_object;

    @BeforeClass
    public void before_Home(){
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        home_page_object =new Home_page(driver);
    }
    @Test
    public void iphone6() throws InterruptedException {

        home_page_object.click_iphone_photo();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=product/product&path=57&product_id=49","Link does not match!");
    }

}
