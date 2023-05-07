package Assignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Unacademy_Source_code {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver d=new FirefoxDriver();
	d.get("https://www.unacademy.com");
	String scr = d.getPageSource();
	System.out.println(scr);
	

	}

}
