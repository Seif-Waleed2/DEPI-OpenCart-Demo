package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReturnPage_Locators {
    WebDriver driver;

    public ReturnPage_Locators(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickReturns()
    {
        driver.findElement(By.xpath("//a[@href='https://awesomeqa.com/ui/index.php?route=account/return/add']")).click();
    }
    public void EnterOrderId()
    {
        driver.findElement(By.id("input-order-id")).sendKeys("1334");
    }
    public void EnterOrderDate()
    {
        driver.findElement(By.id("input-date-ordered")).sendKeys("08-04-2025");
    }
    public void EnterProductName()
    {
        driver.findElement(By.id("input-product")).sendKeys("iMac");
    }
    public void EnterProductCode()
    {
        driver.findElement(By.id("input-model")).sendKeys("Product 14");
    }
    public void EnterProductQuantity()
    {
        driver.findElement(By.id("input-quantity")).sendKeys("1");
    }
    public void SelectReturnReason()
    {
        driver.findElement(By.xpath("//input[@type='radio' and @name='return_reason_id' and @value='2']")).click();
    }
    public void SelectProductStatus()
    {
        driver.findElement(By.xpath("//input[@type='radio' and @name='opened' and @value='1']")).click();
    }
    public void ClickContinueButton()
    {
        driver.findElement(By.className("btn-primary")).click();
    }

}

