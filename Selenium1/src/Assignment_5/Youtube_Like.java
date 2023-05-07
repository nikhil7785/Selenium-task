package Assignment_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube_Like 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.youtube.com");
		Thread.sleep(2000);
		d.findElement(By.name("search_query")).sendKeys(" Chandra Lavani");
		Thread.sleep(2000);
		d.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@href='/watch?v=r6tU3GvJ5so' and @class='yt-simple-endpoint style-scope ytd-video-renderer']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[.='Share']/../../../../../ytd-segmented-like-dislike-button-renderer/div[1]")).click();
		Thread.sleep(2000);
		
	}
}



