package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_page {
    WebDriver driver;
    String actual;

    public Home_page(WebDriver driver) {
        this.driver = driver;
    }
    public void click_iphone_photo(){
        driver.findElement(By.cssSelector("img.img-responsive[alt='iPhone 6']")).click();

    }
//    public String navigate_iphone_page(){
//       return actual =driver.getCurrentUrl("https://awesomeqa.com/ui/index.php?route=product/product&product_id=40");
//
//    }
//    public void navigate_galaxy_page(){
//        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=product/product&path=57&product_id=49");
//    }
}
