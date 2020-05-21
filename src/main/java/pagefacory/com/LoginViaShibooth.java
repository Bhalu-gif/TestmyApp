package pagefacory.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginViaShibooth 
{
		WebDriver driver;
		   public LoginViaShibooth (WebDriver driver) 
		   {
			   this.driver=driver;
		   }
		   
		   @FindBy(how=How.XPATH,using="/html/body/app/body/home/div[2]/div[2]/div[2]/div[1]/div/a[3]/span")
		   WebElement Shibooth;
		   
		   @FindBy(how=How.XPATH,using="/html/body/app/body/home/div[2]/div[2]/div[2]/div[1]/div/a[1]")
		   WebElement shiboothurl;
		   

}
