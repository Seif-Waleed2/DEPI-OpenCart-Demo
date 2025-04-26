package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Testbase {
    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;
@BeforeClass
    public void before(){
    ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
    extent = new ExtentReports();
    extent.attachReporter(spark);
    extent.setSystemInfo("Tester", "Eslam Mohamed Salah");
    extent.setSystemInfo("Tester", "Khaled Yousry Alshahat");
    extent.setSystemInfo("Tester", "Samira Rashad Musallam");
    extent.setSystemInfo("Tester", "Asmaa Ibrahim Ismail");
    extent.setSystemInfo("Tester", "Ismail Zein Elabedeen ");
    extent.setSystemInfo("Tester", "Moanes Fathy Ibrahim");
    extent.setSystemInfo("Environment", "QA");
    driver= new ChromeDriver();
    driver.manage().window().maximize();
}
    @AfterClass
    public void quit () throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        extent.flush();
    }
}
