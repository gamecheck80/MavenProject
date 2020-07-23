package com.training.cucumber.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTests {
  @Test
  public void one() {
	  System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("title : "+title);
		if (title.equals("Google"))	{
			System.out.println("SampleTEST PASSED");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("SampleTEST FAILED");
			Assert.assertTrue(false);
		}
		
		driver.quit();
  }
}
