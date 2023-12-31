package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathIndexing {
	WebDriver driver;
	
	@BeforeMethod
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void indexingMechanism() {
	driver.findElement(By.xpath("(//div[@id='pageFooter']/ul/li)[2]")).click();
	}
	
	@AfterMethod
	public void closeFacebook() {
		driver.quit();
	}
	
	
	
	

}



