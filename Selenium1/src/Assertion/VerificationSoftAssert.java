package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerificationSoftAssert {
	@Test
	public void test2()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, "Facebook – log in ");
		s.assertAll();
		
	}

}
