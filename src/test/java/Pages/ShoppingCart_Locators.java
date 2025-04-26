package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart_Locators {
    WebDriver driver;

    public ShoppingCart_Locators(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickShoppingCart()
    {
        driver.findElement(By.linkText("Shopping Cart")).click();
        //driver.findElement(By.cssSelector("a[href='https://awesomeqa.com/ui/index.php?route=checkout/cart']")).click();
    }

    public void ClickRemoveButton()
    {
        driver.findElement(By.xpath("//button[@data-original-title='Remove']")).click();
    }

}