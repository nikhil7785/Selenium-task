package Assigment_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fire_Lounch_close {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver d=new ChromeDriver();
			Thread.sleep(5000);
			d.close();
		
	}
}
