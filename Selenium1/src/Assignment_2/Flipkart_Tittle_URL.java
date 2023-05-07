package Assignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_Tittle_URL {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		 WebDriver d=new FirefoxDriver();
		 d.get("htttps://www.facebook.com");
		 String title = d.getTitle();
		 System.out.println(title);
		 String url = d.getCurrentUrl();
		 System.out.println(url);
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
