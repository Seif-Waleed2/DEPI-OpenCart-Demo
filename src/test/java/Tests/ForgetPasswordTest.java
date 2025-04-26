package Tests;

import Pages.ForgetPasswordPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForgetPasswordTest extends Testbase{
    ForgetPasswordPage forgetpass;

    @BeforeClass
    public void PostConditions(){
        forgetpass = new ForgetPasswordPage(driver);
        }
    @Test
    public void ForgottenPasswordWithValidEmail() throws InterruptedException {
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        forgetpass.MyAccount();
        forgetpass.LoginCategory();
        forgetpass.ForgottenPassword();
        forgetpass.ValidEmailAddress();
        forgetpass.ContinueButton();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'An email with a confirmation link has been sent your email address.')]")).isDisplayed());

        String Text=driver.findElement(By.xpath("//*[contains(text(), 'An email with a confirmation link has been sent your email address.')]")).getText();
        System.out.println("The Confirmation Text  is:"+Text);

    }

    @Test
    public void ForgottenPasswordWithInvalidEmail(){
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
        forgetpass.MyAccount();
        forgetpass.LoginCategory();
        forgetpass.ForgottenPassword();
        forgetpass.InvalidEmailAddress();
        forgetpass.ContinueButton();
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Warning: The E-Mail Address was not found in our records, please try again!')]")).isDisplayed());

        String WarnText=driver.findElement(By.xpath("//*[contains(text(), 'Warning: The E-Mail Address was not found in our records, please try again!')]")).getText();
        System.out.println("The Warning Text  is:"+WarnText);

    }


}
