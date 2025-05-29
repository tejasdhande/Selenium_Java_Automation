package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangehrmTest {
	
	public static ChromeDriver driver; // creating instance to use the driver in all method // static for using access without creating object of class

	@Test(priority = 1)
	public void loginToApplication() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Enter user name
		driver.findElement(By.name("username")).sendKeys("Admin");
		// Enter password
		driver.findElement(By.name("password")).sendKeys("admin123");
		// click on login
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@Test(priority = 2)
	public void testAdmin() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		boolean isDisplayed = driver.findElement(By.xpath("//h5[text()='System Users']")).isDisplayed();
		Assert.assertTrue(isDisplayed);
		
	}
	
	@Test(priority = 3)
	public void logout() {
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Logout")).click();
	}

}
