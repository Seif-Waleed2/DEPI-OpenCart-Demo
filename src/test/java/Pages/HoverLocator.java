
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HoverLocator {
    WebDriver driver;


    public HoverLocator(WebDriver driver) {
        this.driver = driver;
    }

    public void OpenHomePge() {
        driver.get("https://awesomeqa.com/ui/index.php?route=common/home");
    }

    public void MainCategoriesLocators() {
        driver.findElement(By.xpath("collapse navbar-collapse navbar-ex1-collapse"));
        driver.findElement(By.linkText("Desktops"));
        driver.findElement(By.linkText("Laptops & Notebooks"));
        driver.findElement(By.linkText("Components"));
        driver.findElement(By.linkText("MP3 Players"));
        driver.findElement(By.linkText("PC (0)"));
        driver.findElement(By.linkText("Mac (1)"));
        driver.findElement(By.linkText("test 15 (0)"));
        driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a"));


    }


    public List<WebElement> getMainCategories() {
        return driver.findElements(By.name("mainCategories"));
    }

//    public void HoverOverMainCategory() {
//        List<WebElement> Categories = getMainCategories();
//        if (Categories.isEmpty()) {
//            throw new IllegalArgumentException("No Categories Found to Hover over");
//        }
//        Random ran = new Random();
//        int randomIndex = ran.nextInt(Categories.size());
//
//        WebElement Category = Categories.get(randomIndex);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(Category).perform();
//    }
    public WebElement MainCategories(){
        return driver.findElement(By.xpath("//a[text()='Components']"));

    }
    public WebElement Subcategories(){
      return driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
    }
}


