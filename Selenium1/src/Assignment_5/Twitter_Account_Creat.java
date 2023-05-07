package Assignment_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twitter_Account_Creat {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	driver.get("https://www.Twitter.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("9860644532");*/
	/*Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("9860644532");
	//Thread.sleep(2000);
	//driver.findElement(By.id("SELECTOR_1_LABEL")).click();*/
	
	
	

	}

}
