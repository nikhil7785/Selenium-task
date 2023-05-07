package Gmail3;

import org.testng.annotations.Test;

import Gmail1.Base_class;
import Gmail2.Pomclass;





public class TC1 extends Base_class{
	@Test
	public void Testscript()
	{
		Pomclass p= new Pomclass(driver);
		p.mailid("nikhildurve99@gmail.com");
		p.button();
	}

}
