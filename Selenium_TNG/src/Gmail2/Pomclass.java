package Gmail2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass {
	@FindBy(xpath="//input[@aria-label='Email or phone']")
	private WebElement emailid_textfield;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement nextbutton;
	
	
	public Pomclass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void mailid(String id)
	{
		emailid_textfield.sendKeys(id);
	}
	public void button()
	{
		nextbutton.click();
	}
	

}
