package RestAPI;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        //System.out.println("Test Started: " + result.getName());
        System.out.println("Test method started");
        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //System.out.println("Test Passed: " + result.getName());
    	System.out.println("Test is successfull");
        
    }

    @Override
    public void onTestFailure(ITestResult result) {
       // System.out.println("Test Failed: " + result.getName());
       
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //System.out.println("Test Skipped: " + result.getName());
        
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // This can be left empty or used as needed
    	System.out.println("Method Test Started");
    }

    @Override
    public void onStart(ITestContext context) {
       // System.out.println("Test Suite Started: " + context.getName());
        System.out.println("Test Suite Started -----");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Suite Finished: " + context.getName());
    }
}
