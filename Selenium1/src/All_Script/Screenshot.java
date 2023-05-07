package All_Script;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	/*public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.zomato.com");
		Thread.sleep(2000);
		
		
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		File per = new File("C:\\Users\\Nikhil Durve\\Desktop\\Screenshot.zomato.jpeg");
		FileHandler.copy(temp,per);
	}*/
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.Zomato.com");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\Nikhil Durve\\Desktop\\Screenshot\\Zomatodefect2.jpeg");
		FileHandler.copy(src, dst);

}
}
