package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage_Locators {
    WebDriver driver ;

    public HomePage_Locators(WebDriver driver) {
        this.driver = driver;
    }
    public void Home()
    {
        driver.findElement(By.xpath("//a[img[contains(@src, 'opencart-logo.png')]]")).click();
    }
    public void ClickAddToCart()
    {
        driver.findElement(By.cssSelector("button[onclick*=\"cart.add('43')\"]")).click();
    }
    public void ClickMyAccount()
    {
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
    }
    public void Login()
    {
        driver.findElement(By.linkText("Login")).click();
    }
    public void RegisterButton()
    {
        driver.findElement(By.linkText("Register")).click();
    }
    public void ClickSearchBar()
    {
        driver.findElement(By.className("form-control")).sendKeys("Iphone", Keys.ENTER);
    }
    public void ClickSearchIcon()
    {
        driver.findElement(By.className("btn-default"));
    }
    public void DesktopCategory()
    {
        driver.findElement(By.linkText("Desktops")).click();
    }
    public void LaptopsCategory()
    {
        driver.findElement(By.linkText("Laptops & Notebooks")).click();
    }
    public void ComponentsCategory()
    {
        driver.findElement(By.linkText("Components")).click();
    }
    public void ClickLogout()
    {
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }

}
