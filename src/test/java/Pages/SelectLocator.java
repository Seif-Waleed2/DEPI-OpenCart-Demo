package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectLocator {
    WebDriver driver;

    public SelectLocator(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickTablets() {
        driver.findElement(By.xpath("//a[text()='Tablets']"));
        WebElement tabletsLink = driver.findElement(By.xpath("//a[text()='Tablets']"));
        tabletsLink.click();  // Click the tablets link


    }
    // Method to hover over "Desktops" and click "Mac"
//    public void SelectMac() {
//        // Locate the "Desktops" category (parent category)
//        WebElement desktopsLink = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));
//
//        // Use Actions to hover over "Desktops"
//        Actions actions = new Actions(driver);
//        actions.moveToElement(desktopsLink).perform();  // Hover over the Desktops link
//
//        // Wait for the "Mac" subcategory to appear in the dropdown
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mac (1)']")));
//        element.click();
//
//        }




    // Method to hover over "Desktops" and click "Mac"
  /*  public void hoverAndClickMac() {
        // Locate the "Desktops" category (parent category)
        WebElement desktopsLink = driver.findElement(By.xpath("//a[text()='Desktops']"));

        // Use Actions to hover over "Desktops"
        Actions actions = new Actions(driver);
        actions.moveToElement(desktopsLink).perform();  // Hover over the Desktops link

        // Wait for the "Mac" subcategory to appear in the dropdown
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement macLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mac']")));

        // Click the "Mac" subcategory
        macLink.click();


    }

    public void ClickMac() {

        driver.findElement(By.xpath("//a[text()='Mac (1)']"));
        WebElement macLink = driver.findElement(By.xpath("//a[text()='Mac']"));
        macLink.click();  // Click the mac
    }*/
}



