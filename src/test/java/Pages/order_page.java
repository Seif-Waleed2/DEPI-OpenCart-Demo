package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class order_page {
    public order_page(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public void login_order() {
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("test@depi.com");
        driver.findElement(By.id("input-password")).sendKeys("1234");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    }
    public void selsct_iteam1() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Desktops"))).perform();
        driver.findElement(By.linkText("Mac (1)")).click();
    }
    public void add_to_cart() {
        WebElement btn = driver.findElement(By.cssSelector("button[onclick=\"cart.add('41', '1');\"]"));
        btn.click();
    }
    public void navigate_to_cart(){
        driver.findElement(By.linkText("Shopping Cart")).click();
    }
public void checkout_btn(){
        driver.findElement(By.linkText("Checkout")).click();
    }

    public void payment_address_btn(){
        driver.findElement(By.id("button-payment-address")).click();
    }
    public void shipping_address_btn(){
        driver.findElement(By.id("button-shipping-address")).click();
    }
    public void shipping_method_btn(){
        driver.findElement(By.id("button-shipping-method")).click();
    }
    public void Terms_Conditions_checkbox(){
        driver.findElement(By.name("agree")).click();
    }
    public void payment_method_btn(){
        driver.findElement(By.id("button-payment-method")).click();
    }
 public void confirm_method_btn(){
        driver.findElement(By.id("button-confirm")).click();
    }

}
