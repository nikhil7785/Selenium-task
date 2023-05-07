package Assignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy_Tittle_Url {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.swiggy.in");
	String tittle = d.getTitle();
	System.out.println("Tittel is :- "+tittle);
	String url = d.getCurrentUrl();
	System.out.println(url);
	}

}
