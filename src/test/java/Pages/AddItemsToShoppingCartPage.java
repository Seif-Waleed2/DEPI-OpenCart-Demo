package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItemsToShoppingCartPage {

    WebDriver driver;

    public AddItemsToShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ShoppingCart(){
        driver.findElement(By.xpath("//i[contains(@class, 'fa-shopping-cart')]")).click();
    }
    public void ContinueButton(){
        driver.findElement(By.linkText("Continue")).click();
    }
    public void Add(){
        driver.findElement(By.xpath("//*[@onclick=\"cart.add('43');\"]")).click();
    }
    public void ShowCart(){
        driver.findElement(By.id("cart-total")).click();
    }
    public void ViewCart(){
        driver.findElement(By.linkText("View Cart")).click();
    }
    public void RemoveItem(){
        driver.findElement(By.xpath("//i[contains(@class,'fa-times')]")).click();
    }
    public void Checkout(){
        driver.findElement(By.linkText("Checkout")).click();
    }




}
