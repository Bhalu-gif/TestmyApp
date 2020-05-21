package pagefacory.fastest;




import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefacory.com.SeagenhHomepage;

import pagefacory.com.LoginViaOffice;

public class Seatgenlogintest extends Testbase
{

	
	
	@Test
	public void newgen() throws InterruptedException 
	{
		 
		SeagenhHomepage  mainhome = PageFactory.initElements(driver,SeagenhHomepage.class);
		mainhome.Clickologin();
		Thread.sleep(5000);
		
		
		
		LoginViaOffice roster = PageFactory.initElements(driver,LoginViaOffice.class);
		roster.officeintro();
		Thread.sleep(5000);
		
		roster.gotoemail("komal.dhole@datafortune.com");
		Thread.sleep(3000);
		
		roster.gotopass("Welcome@2020");
		Thread.sleep(3000);
	}
}
