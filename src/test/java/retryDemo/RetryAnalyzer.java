package retryDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int count = 0;
    int maxTry = 3; // Retry twice

    public boolean retry(ITestResult result) {
        if (count < maxTry) {
            count++;
            return true; // retry test
        }
        return false; // don't retry
    }
}
