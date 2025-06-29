package retryDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoogleTitleTest extends BaseTestUtils {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    @Test
    public void verifyGoogleTitle(){
        driver.get("https://www.google.com/");
        //waitForPageToLoad(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        String title = driver.getTitle();
        System.out.println("Page title is "+title);
        Assert.assertTrue(title.contains("Google"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
