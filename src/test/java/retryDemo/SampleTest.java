package retryDemo;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;


public class SampleTest {

    int attempt = 0;

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testRetryLogic()
    {
        attempt++;
        System.out.println("Running attempt no. "+attempt);
        Assert.assertEquals(attempt, 3);
    }
}
