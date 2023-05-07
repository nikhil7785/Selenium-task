package Webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_is_displayed_or_not {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		if(user.isDisplayed())
		{
			user.sendKeys("niks13_d");
		}
		else
		{
			System.out.println("Element is not displayed");
		}
			
		
	}

}
