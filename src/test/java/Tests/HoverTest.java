package Tests;

import Pages.HoverLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class HoverTest extends Testbase{
    HoverLocator HomePageLocator_object;
    Actions action;
    @BeforeClass
    public void precondition(){
        HomePageLocator_object=new HoverLocator(driver);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
         action = new Actions(driver);
    }
    @Test
    //TC 0 4
    public void HoverOverMainCategoriesRandomly() throws InterruptedException {
        WebElement mainCategory = HomePageLocator_object.MainCategories();
        WebElement subCategory = HomePageLocator_object.Subcategories();
        // Hover on Main Category
        action.moveToElement(mainCategory).perform();

        // Wait for Sub Category to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(subCategory));

        // TC 0 5
        // Hover on Sub Category
        action.moveToElement(subCategory).perform();
        Thread.sleep(1000);
    }

}


