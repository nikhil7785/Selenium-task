package Assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click_Action {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver d=new FirefoxDriver();
	//d.get("https://open.spotify.com/");
	d.get("https://www.instagram.com/");
	d.findElement(By.tagName("a")).click();
	
		
	}

}
