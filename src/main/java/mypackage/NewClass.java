package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewClass
{
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("title : "+title);
		if (title.equals("Google"))
		{
			System.out.println("TEST PASSED");
		}
		else
		{
			System.out.println("TEST FAILED");
		}
		
		driver.close();
	}
}
