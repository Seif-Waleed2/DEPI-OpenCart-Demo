package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Adress_page {
    WebDriver driver;

    public Adress_page(WebDriver driver) {
        this.driver = driver;
    }
    public void login_Adress() {
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("test@depi.com");
        driver.findElement(By.id("input-password")).sendKeys("1234");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    }
    public void navigate_to_Adresspage(){
        driver.findElement(By.linkText("Modify your address book entries")).click();

    }

    public void delete() {
        driver.findElement(By.xpath("//a[@href='https://awesomeqa.com/ui/index.php?route=account/address/delete&address_id=1337']")).click();
    }
    public void ok() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
public void New_Adress(){
        driver.findElement(By.linkText("New Address")).click();
}
public void Address_Information() throws InterruptedException {
        driver.findElement(By.id("input-firstname")).sendKeys("Islam");
        driver.findElement(By.id("input-lastname")).sendKeys("Mohamed");
        driver.findElement(By.id("input-address-1")).sendKeys("Ghaly STR.");
        driver.findElement(By.id("input-city")).sendKeys("Mitghamr_city");
        driver.findElement(By.id("input-postcode")).sendKeys("00000");
        WebElement select_element1=driver.findElement(By.id("input-country"));
        Select Listobject1= new Select(select_element1);
        Listobject1.selectByVisibleText("Egypt");
        Thread.sleep(1000);
        WebElement select_element2=driver.findElement(By.id("input-zone"));
        Select Listobject2= new Select(select_element2);
        Listobject2.selectByVisibleText("Ad Daqahliyah");
        driver.findElement(By.cssSelector("input[type='submit'][value='Continue']")).click();
}
}
