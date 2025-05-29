package com.orange.hrm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class HomePage {
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminLink;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")
	WebElement profilePicture;
	
	@FindBy(linkText = "Logout")
	WebElement logoutButton;
	
	public HomePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	Logger log = LogManager.getLogger(HomePage.class);
	
	public void clickOnAdminLink() {
		adminLink.click();
		log.info("Admin link is clicked");
	}
	
	
	public void logoutFromApplication() {
		profilePicture.click();
		log.info("Profile picture link is clicked");
		ExtentReportUtils.addStep("Profile picture icon is clicked");
		
		logoutButton.click();
		log.info("Logged out of application");
		ExtentReportUtils.addStep("logout link is clicked");
	}

}
