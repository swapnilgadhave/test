package RestAPI;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IListerAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.out.println("Retrying test " + result.getName() + " with status " + result.getStatus() +
                    " for the " + retryCount + " time(s).");
            return true;
        }
        return false;
    }
}
