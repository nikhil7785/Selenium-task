package Assigment_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application_Launch_Firefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver d= new ChromeDriver();
	//d.get("https://www.youtube.com");
	//d.close();
		
	}

}
