package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener{
	public void onStart(ITestContext arg)
	{
		System.out.println("Start Test case execution"+arg.getName());
	}
	public void onFinish(ITestContext arg)
	{
		System.out.println("Finish Test Execution"+arg.getName());
	}
	public void onTestStart(ITestResult arg)
	{
		System.out.println("Start Test"+arg.getName());
		
	}
	public void onTestSkipped(ITestResult arg)
	{
		System.out.println("Skip test"+arg.getName());
	}
	public void onTestSuccess(ITestResult arg)
	{
		System.out.println("Passed Test"+arg.getName());
	}
	public void onTestFailure(ITestResult arg)
	{
		System.out.println("Failed test:"+arg.getName());
	}
	

}
