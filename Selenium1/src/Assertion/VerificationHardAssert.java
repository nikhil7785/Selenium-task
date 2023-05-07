package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VerificationHardAssert {
	@Test
	public void test1()
	//public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title,"Facebook – log in or sign up");
		System.out.println("test case pass");
		
		
	}

}
