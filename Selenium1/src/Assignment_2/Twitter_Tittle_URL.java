package Assignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter_Tittle_URL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.twitter.com");
	String tittle = d.getTitle();
	System.out.println("Tittle is :- "+tittle);
	String url = d.getCurrentUrl();
	System.out.println("URL is :- "+url);
	
	

	}

}
