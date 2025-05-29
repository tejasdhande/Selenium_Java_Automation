package com.report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReportUtils.createTest(result.getMethod().getMethodName());

	}



	@Override
	public void onFinish(ITestContext context) {
		ExtentReportUtils.flushReport();
	}

	

}
