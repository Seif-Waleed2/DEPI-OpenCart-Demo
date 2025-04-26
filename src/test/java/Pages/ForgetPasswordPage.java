package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    WebDriver driver;

    public ForgetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public void MyAccount(){
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
    }
    public void LoginCategory(){
        driver.findElement(By.linkText("Login")).click();
    }
    public void ForgottenPassword(){
        driver.findElement(By.linkText("Forgotten Password")).click();
    }
    public void ValidEmailAddress(){
        driver.findElement(By.id("input-email")).sendKeys("test@depi.com");
    }
    public void InvalidEmailAddress(){
        driver.findElement(By.id("input-email")).sendKeys("test123.com");
    }
    public  void ContinueButton(){
        driver.findElement(By.xpath("//input[contains(@value,'Continue')]")).click();
    }
    public void Confirmation(){
        driver.findElement(By.xpath("//i[text() = ' An email with a confirmation link has been sent your email address.")).isDisplayed();
    }


}
