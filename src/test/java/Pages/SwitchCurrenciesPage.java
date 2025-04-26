package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchCurrenciesPage {
    WebDriver driver;

    public SwitchCurrenciesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void MyAccount(){
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
    }
    public void LoginCategory(){
        driver.findElement(By.linkText("Login")).click();
    }
    public  void  LoggedEmail(){
        driver.findElement(By.id("input-email")).sendKeys("test@depi.com");

    }
    public void LoggedPassword(){
        driver.findElement(By.id("input-password")).sendKeys("1234");
    }
    public void LoginButton(){
        driver.findElement(By.linkText("Login")).click();
    }
    public void Currency(){
        driver.findElement(By.xpath("//span[text()='Currency']")).click();
    }
    public void EuroCategory(){
        driver.findElement(By.xpath("//button[text()='€ Euro']")).click();
    }
    public void USDCategory(){
        driver.findElement(By.xpath("//button[text()='$ US Dollar']")).click();
    }
    public void PoundCategory(){
        driver.findElement(By.xpath("//button[text()='£ Pound Sterling']")).click();
    }

}
