package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class wishlist_compare_page {
    WebDriver driver;


    public wishlist_compare_page(WebDriver driver) {
        this.driver = driver;
    }

    public void login_page() {

        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("test@depi.com");
        driver.findElement(By.id("input-password")).sendKeys("1234");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    }

    public void selsct_iteam() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Components"))).perform();
        driver.findElement(By.linkText("Monitors (2)")).click();
    }

    public void addwishlist() {
        WebElement btn = driver.findElement(By.cssSelector("button[onclick=\"wishlist.add('42');\"]"));
        btn.click();
    }
    public void navigate_to_wishlist(){
        driver.findElement(By.id("wishlist-total")).click();
    }

    public void addcompare1() {
        WebElement com1 = driver.findElement(By.cssSelector("button[onclick=\"compare.add('42');\"]"));
        com1.click();
    }    public void addcompare2() {
        WebElement com2 = driver.findElement(By.cssSelector("button[onclick=\"compare.add('33');\"]"));
        com2.click();
    }
    public void navigate_to_comparison(){driver.findElement(By.id("compare-total")).click();
    }

}