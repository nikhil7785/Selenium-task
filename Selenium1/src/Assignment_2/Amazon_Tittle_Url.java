package Assignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Tittle_Url {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		
		String title = d.getTitle();
		System.out.println("Title is:-  "+title);
		String url = d.getCurrentUrl();
		System.out.println("URL is:-  "+url);
		Thread.sleep(5000);
		
		
		
	}

}
