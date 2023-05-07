package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement src1 = driver.findElement(By.xpath("//div[@id='box1']"));
		Thread.sleep(2000);
		WebElement dst1 = driver.findElement(By.xpath("//div[@id='box101']"));
		Actions act1=new Actions(driver);
		act1.dragAndDrop(src1,dst1 ).perform();
		Thread.sleep(2000);
		WebElement src2 = driver.findElement(By.xpath("//div[@id='box2']"));
		Thread.sleep(2000);
		WebElement dst2 = driver.findElement(By.xpath("//div[@id='box102']"));
		Actions act2=new Actions(driver);
		act2.dragAndDrop(src2,dst2 ).perform();
		Thread.sleep(2000);
		WebElement src3 = driver.findElement(By.xpath("//div[@id='box3']"));
		Thread.sleep(2000);
		WebElement dst3 = driver.findElement(By.xpath("//div[@id='box103']"));
		Actions act3=new Actions(driver);
		act3.dragAndDrop(src3,dst3 ).perform();
		Thread.sleep(2000);
		WebElement src4 = driver.findElement(By.xpath("//div[@id='box4']"));
		Thread.sleep(2000);
		WebElement dst4 = driver.findElement(By.xpath("//div[@id='box104']"));
		Actions act4=new Actions(driver);
		act4.dragAndDrop(src4,dst4 ).perform();
		Thread.sleep(2000);
		WebElement src5 = driver.findElement(By.xpath("//div[@id='box5']"));
		Thread.sleep(2000);
		WebElement dst5 = driver.findElement(By.xpath("//div[@id='box105']"));
		Actions act5=new Actions(driver);
		act5.dragAndDrop(src5,dst5 ).perform();
		Thread.sleep(2000);
		WebElement src6= driver.findElement(By.xpath("//div[@id='box6']"));
		Thread.sleep(2000);
		WebElement dst6 = driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act6=new Actions(driver);
		act6.dragAndDrop(src6,dst6 ).perform();
		Thread.sleep(2000);
		WebElement src7 = driver.findElement(By.xpath("//div[@id='box7']"));
		Thread.sleep(2000);
		WebElement dst7 = driver.findElement(By.xpath("//div[@id='box107']"));
		Actions act7=new Actions(driver);
		act7.dragAndDrop(src7,dst7 ).perform();
		
		
		
		
		
		
		
	}

}
