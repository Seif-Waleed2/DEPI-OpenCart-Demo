package Tests;

import Pages.SelectLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.google.common.util.concurrent.Futures.withTimeout;

public class SelectTest {
    WebDriver driver;
    SelectLocator SelectLocator_object;


    @BeforeClass
    public void preCondition() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        SelectLocator_object = new SelectLocator(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
    }

    @Test
    //TC 0 6 SelectMainCategoriesRandom
    public void RightSelect() throws InterruptedException {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        SelectLocator_object.ClickTablets();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=product/category&path=57");

        driver.quit();


    }

//    @Test
//    //TC 0 7 SelectSubCategoriesRandom
//
//    public void SelectMac() {
//        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
//        WebElement desktopsLink = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/a")));
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



    //}

    //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   //   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mac']")));
    //  WebElement macLink = driver.findElement(By.xpath("//a[text()='Mac']"));
    //  macLink.click();
}


