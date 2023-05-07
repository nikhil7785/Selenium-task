package Releval1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Task1 {
	public static WebDriver driver;
	public static WebDriverWait wait;
	@BeforeMethod
	public void launchurl()
	{
		System.setProperty("webdriver.gecko.driver","./Drivers1/geckodriver.exe");
		driver=new FirefoxDriver();
		Reporter.log("Beganning of the Browser", true);
		driver.manage().window().maximize();
		driver.get("https://www.switchme.in/calculator/prepayment");
		Reporter.log("Launch the application", true);
		wait=new WebDriverWait(driver,10);
				
	}
	@AfterMethod
	public void closeurl()
	{
		Reporter.log("End of the Browser", true);
		driver.close();
	}
	

}
