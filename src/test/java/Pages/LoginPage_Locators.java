package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_Locators {
    WebDriver driver ;

    public LoginPage_Locators(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterEMail()
    {
        driver.findElement(By.id("input-email")).sendKeys("test@depi.com");
    }
    public void EnterPassword()
    {
        driver.findElement(By.id("input-password")).sendKeys("1234");
    }
    public void ClickLoginBTN()
    {
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    }
}
