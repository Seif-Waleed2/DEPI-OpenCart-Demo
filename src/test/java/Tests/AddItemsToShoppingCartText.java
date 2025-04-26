package Tests;

import Pages.AddItemsToShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddItemsToShoppingCartText extends Testbase{
    AddItemsToShoppingCartPage addtocart;

   @BeforeClass
    public void PostConditions(){
        addtocart = new AddItemsToShoppingCartPage(driver);
    }

    @Test
    public void EmptyCart() throws InterruptedException {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        addtocart.ShoppingCart();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div/p")).isDisplayed());
    }

    @Test
    public void AddItemToCart() throws InterruptedException {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        addtocart.ShoppingCart();
        Thread.sleep(1000);
        addtocart.ContinueButton();
        Thread.sleep(1000);
        addtocart.Add();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Success: You have added')]")).isDisplayed());
        addtocart.ShowCart();
        Assert.assertTrue(driver.findElement(By.linkText("MacBook")).isDisplayed());
        Thread.sleep(1000);
    }

    @Test
    public void ViewCart() throws InterruptedException {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        addtocart.Add();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Success: You have added')]")).isDisplayed());
        addtocart.ShowCart();
        addtocart.ViewCart();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.linkText("MacBook")).isDisplayed());
        Thread.sleep(1000);
    }

    @Test
    public void RemoveItemFromCart() throws InterruptedException {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        addtocart.Add();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Success: You have added')]")).isDisplayed());
        Thread.sleep(1000);
        addtocart.ShowCart();
        addtocart.RemoveItem();
        addtocart.ShoppingCart();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div/p")).isDisplayed());
        Thread.sleep(1000);

    }

    @Test
    public void CheckoutForItem() throws InterruptedException {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        addtocart.Add();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Success: You have added')]")).isDisplayed());
        addtocart.ShowCart();
        addtocart.Checkout();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Checkout')]")).isDisplayed());
    }



}
