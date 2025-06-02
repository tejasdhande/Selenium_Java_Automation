package com.orange.hrm.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.hrm.pages.LoginPage;
//import com.utility.ExcelUtility;
import com.utility.PropertiesUtility;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginWithValidUserAndPassword() throws InvalidFormatException, IOException {
		LoginPage loginPage = new LoginPage();
		
		// Apache POI Library.
		
		//loginPage.loginToApplication(ExcelUtility.getTestData(1, 0), ExcelUtility.getTestData(1,1));
		
		
		// Properties class of java
		
		loginPage.loginToApplication(PropertiesUtility.getData("username"), PropertiesUtility.getData("password"));
	}

}
