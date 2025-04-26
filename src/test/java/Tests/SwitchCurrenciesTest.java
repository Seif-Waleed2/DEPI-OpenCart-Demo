package Tests;

import Pages.SwitchCurrenciesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SwitchCurrenciesTest extends Testbase{
    SwitchCurrenciesPage currencypage;

@BeforeClass
    public void PostConditions(){
         currencypage = new SwitchCurrenciesPage(driver);
    }
    @Test
    public void SwitchFromUSD_To_Euro() throws InterruptedException {
    driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
    currencypage.MyAccount();
//        Thread.sleep(3000);
    currencypage.LoginCategory();
    currencypage.LoggedEmail();
    currencypage.LoggedPassword();
    currencypage.LoginButton();
    String currentCurrencyUS = driver.findElement(By.xpath("//*[contains(text(), '$')]")).getText();
    System.out.println("Current Currency Text: " + currentCurrencyUS);

    currencypage.Currency();
    currencypage.EuroCategory();

        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), '€')]")).isDisplayed());
        String NewCurrencyEU = driver.findElement(By.xpath("//*[contains(text(), '€')]")).getText();
        System.out.println("New Currency Text: " + NewCurrencyEU);
    }

    @Test
    public void SwitchFromEuro_To_USD(){
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        currencypage.MyAccount();
        currencypage.LoginCategory();
        currencypage.LoggedEmail();
        currencypage.LoggedPassword();
        currencypage.LoginButton();
        String currentCurrencyEU = driver.findElement(By.xpath("//*[contains(text(), '€')]")).getText();
        System.out.println("Current Currency Text: " + currentCurrencyEU);

        currencypage.Currency();
        currencypage.USDCategory();
           Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), '$')]")).isDisplayed());
        String NewCurrencyUS = driver.findElement(By.xpath("//*[contains(text(), '$')]")).getText();
        System.out.println("New Currency Text: " + NewCurrencyUS);
    }

    @Test
    public void SwitchFromEuro_To_Pound(){
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        currencypage.MyAccount();
        currencypage.LoginCategory();
        currencypage.LoggedEmail();
        currencypage.LoggedPassword();
        currencypage.LoginButton();
        String currentCurrencyEU = driver.findElement(By.xpath("//*[contains(text(), '€')]")).getText();
        System.out.println("Current Currency Text: " + currentCurrencyEU);

        currencypage.Currency();
        currencypage.PoundCategory();
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), '£')]")).isDisplayed());

        String NewCurrencyP = driver.findElement(By.xpath("//*[contains(text(), '£')]")).getText();
        System.out.println("New Currency Text: " + NewCurrencyP);
    }

}
