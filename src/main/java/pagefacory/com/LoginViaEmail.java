package pagefacory.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginViaEmail
{
   WebDriver driver;
   public LoginViaEmail(WebDriver driver) 
   {
	   this.driver=driver;
   }
   @FindBy(how=How.XPATH,using="/html/body/app/body/home/div[2]/div[2]/div[2]/div[1]/div/a[1]/span")
   WebElement gmail;
   
   @FindBy(how=How.XPATH,using="//*[@id=\"identifierId\"]")
   WebElement email;
   
   @FindBy(how=How.XPATH,using="//*[@id=\"password\"]/div[1]/div/div[1]/input")
   WebElement pass;
   
   @FindBy(how=How.XPATH,using="//*[@id=\"identifierNext\"]/span/span")
   WebElement  next;
   
   public void gotogmail() 
   {
	   WebDriverWait wait = new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.visibilityOf(gmail));

	   gmail.click();
   }
   public void gotoemail(String emailw) 
   {
	   email.sendKeys(emailw);
   }
   public void gotopass(String passw) 
   {
	   pass.sendKeys(passw);
   }
   public void nextto() 
   {
	   next.click();
   }
}
