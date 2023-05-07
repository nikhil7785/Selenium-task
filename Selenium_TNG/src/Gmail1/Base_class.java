package Gmail1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class {
	public static WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.gecko.driver","./drivers1/geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Reporter.log("Application launch Successfully ", true);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
		Reporter.log("Application close Successfully", true);
	}

}
