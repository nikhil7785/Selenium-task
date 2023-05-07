package Assignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swiggy_Source_Code {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver d=new FirefoxDriver();
	d.get("https://www.swiggy.in");
	String scr = d.getPageSource();
	System.out.println(scr);
	}

}
