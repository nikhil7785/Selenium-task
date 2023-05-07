package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data_Pass_and_Clear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Nikhil%20Durve/Desktop/n.html");
		WebElement un = driver.findElement(By.tagName("input"));
		Thread.sleep(2000);
		un.sendKeys("Nikhilraje");
		Thread.sleep(2000);
		un.clear();
		WebElement pwd = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		pwd.sendKeys("Niks13d");
		Thread.sleep(2000);
		pwd.clear();
	    driver.findElement(By.id("cbox")).click();
	    Thread.sleep(2000);
		driver.findElement(By.id("male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("female")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("custom")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
	}
}
		
		
		
		
	


