package Assignment_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and @autocomplete='off' and @class='_2IX_2- VJZDxU']")).sendKeys("9860644532");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Raje@7785");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();

	}

}
