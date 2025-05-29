package com.orange.hrm.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.report.ExtentReportUtils;

public class BaseTest {
	
	static public WebDriver driver;
	
	@BeforeSuite
	void initDriver() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@BeforeSuite
	public void beforeSuite() {
	    ExtentReportUtils.setUpReport();
	}

}
