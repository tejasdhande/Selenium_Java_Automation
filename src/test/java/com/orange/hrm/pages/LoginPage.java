package com.orange.hrm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class LoginPage {
	 
	//user name
	@FindBy(name="username")
	WebElement usernameTextBox;
	
	//password
	@FindBy(name="password")
	WebElement passwordTextBox;
	
	//login button
	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement LoginBTn;
	
	public LoginPage(){
		
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	 Logger log = LogManager.getLogger(LoginPage.class);
	 
	public void loginToApplication(String name , String password) {
		usernameTextBox.sendKeys(name);
		log.info("Username is enetered");
		ExtentReportUtils.addStep("Username is entered");
		
		passwordTextBox.sendKeys(password);
		log.info("Password is enetered");
		ExtentReportUtils.addStep("Password is entered");
		
		LoginBTn.click();
		log.info("Login button is clicked");
		ExtentReportUtils.addStep("Login button is clicked");
	}
	

}
