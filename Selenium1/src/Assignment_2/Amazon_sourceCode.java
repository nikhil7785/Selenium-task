package Assignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_sourceCode {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.amazon.in");
		String src = d.getPageSource();
		System.out.println(src);
		
	}
		

}
