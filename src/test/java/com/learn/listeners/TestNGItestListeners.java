package com.learn.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGItestListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("*****Test started , onTestStart*****: "+ result.getName() + " ,"+ result.getTestName() );	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("**** Test is succesfull. onTestSuccess() "+ result.getName() + " ,"+ result.getTestName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("****Test Failed**** onTestFailure() "+  result.getName() );
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("****Test Skipped**** onTestSkipped() "+  result.getName() );
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("****Test onTestFailedButWithinSuccessPercentage**** onTestFailedButWithinSuccessPercentage() "+  result.getName() );
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("****Test onTestFailedWithTimeout**** onTestFailedWithTimeout() "+  result.getName() );
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("****Test start**** onStart() "+ context.getName() );
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("****on finish**** onFinish() "+  context.getName() );
	}
	
}
