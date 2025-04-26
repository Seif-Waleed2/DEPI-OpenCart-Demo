package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage_Locators {
    WebDriver driver;

    public RegisterPage_Locators(WebDriver driver) {
        this.driver = driver;

    }
    public void EnterFirstName()
    {
        driver.findElement(By.id("input-firstname")).sendKeys("Zonnya");
    }
    public void EnterLastName()
    {
        driver.findElement(By.id("input-lastname")).sendKeys("Gollop");
    }
    public void EnterEmail()
    {
        String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
        String emailID = "User"+userName+"@example.com";
        driver.findElement(By.id("input-email")).sendKeys(emailID);
    }
    public void EnterTelephone()
    {
        driver.findElement(By.id("input-telephone")).sendKeys("1703611377");
    }
    public void EnterPassword()
    {
        driver.findElement(By.id("input-password")).sendKeys("iR49234}");
    }
    public void ReEnterPassword()
    {
        driver.findElement(By.id("input-confirm")).sendKeys("iR49234}");
    }
    public void ClickCheckBox()
    {
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
    }
    public void ClickContinueButton()
    {
        driver.findElement(By.className("btn-primary")).click();
    }

    //TC04
    public void EnterBlankFirstName()
    {
        driver.findElement(By.id("input-firstname")).sendKeys("");
    }
    public void EnterBlankLastName()
    {
        driver.findElement(By.id("input-lastname")).sendKeys("");
    }
    public void EnterInvalidEmail()
    {
        driver.findElement(By.id("input-email")).sendKeys("");
    }
    public void EnterInvalidTelephone()
    {
        driver.findElement(By.id("input-telephone")).sendKeys("");
    }
    public void EnterInvalidPassword()
    {
        driver.findElement(By.id("input-password")).sendKeys("123");
    }
    public void EnterInvalidConfirm()
    {
        driver.findElement(By.id("input-confirm")).sendKeys("123456");
    }
    public void DoNotClickCheckBox()
    {
        driver.findElement(By.cssSelector("input[type='checkbox']"));
    }
    public void ClickOnContinueButton()
    {
        driver.findElement(By.className("btn-primary")).click();
    }
}