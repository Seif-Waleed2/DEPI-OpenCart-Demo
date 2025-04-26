package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLocator {
  WebDriver driver;


  public LoginLocator(WebDriver driver) {
    this.driver = driver;}
  public void clickMyAccount (){
    driver.findElement(By.xpath("//span[text()='My Account']")).click();
  }
  public void Login(){
    driver.findElement(By.linkText("Login")).click();
  }
    public void enterEmail (String email) {
      driver.findElement(By.id("input-email")).sendKeys("email");


    }

    public void EnterPassword (String password) {
      driver.findElement(By.id("input-password")).sendKeys("password");

    }
    public void clickLogin () {
      driver.findElement(By.cssSelector(".btn.btn-primary")).click();




    }


//

  }





