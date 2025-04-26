package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Newsletter_page {
    WebDriver driver;

    public Newsletter_page(WebDriver driver) {
        this.driver = driver;
    }
    public void login_Newsletter() {
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("test@depi.com");
        driver.findElement(By.id("input-password")).sendKeys("1234");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    }
    public void Newsletter_navigate(){
        driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter")).click();
    }
    public void subscribe(){
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    }

}
