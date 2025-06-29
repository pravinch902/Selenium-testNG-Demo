package retryDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BaseTestUtils {
    public void waitForPageToLoad(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i<20; i++){
            try
            {
                Thread.sleep(10000);
                String state = js.executeScript("return document.readyState").toString();
                System.out.println("The page load status is "+state);
                if (state.equals("complete"))
                {
                    System.out.println("Page loaded successfully");
                    Thread.sleep(10000);
                    break;
                }

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
}
