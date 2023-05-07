package Assigment_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application_launch_Chrome {
	public static void main(String[] args)  {
		//System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		 System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

	        // create a Chrome WebDriver instance
	        WebDriver driver = new ChromeDriver();

	        // navigate to the Amazon website
	        driver.get("https://www.amazon.com");

	        // take a screenshot of the page
	        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	        // save the screenshot to a file
	        try {
	            FileUtils.copyFile(screenshotFile, new File("amazon_screenshot.png"));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // close the browser window
	        driver.quit();
	    }
	}
	