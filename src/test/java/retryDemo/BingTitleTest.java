package retryDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class BingTitleTest extends BaseTestUtils {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    @Test
    public void verifyBingTitle() {
        driver.get("https://www.bing.com");
        waitForPageToLoad(driver);
        String title = driver.getTitle();
        System.out.println("Bing title is: " + title);
        Assert.assertTrue(title.contains("Bing"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
