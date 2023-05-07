package Assignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify_sourceCode {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.spotify.com");
	String src = d.getPageSource();
	System.out.println(src);
	}

}
