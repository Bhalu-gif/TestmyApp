package pagefacory.com;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginViaOffice 
{
	WebDriver driver;
	   public LoginViaOffice (WebDriver driver) 
	   {
		   this.driver=driver;
	   }
	   @FindBy(how=How.CSS,using="body > home > div.homediv > div.row > div.container > div.col-xs-12.col-sm-6 > div > a:nth-child(3) > span")
	   WebElement office;
	   
	   @FindBy(how=How.XPATH,using="//*[@id=\"i0116\"]")
	   WebElement officeEmail;
	   
	   @FindBy(how=How.XPATH,using="//*[@id=\"idSIButton9\"]")
	   WebElement  Officenext;
	   
	   @FindBy(how=How.XPATH,using="//*[@id=\"i0118\"]")
	   WebElement officepass;
	   
	   @FindBy(how=How.XPATH,using="//*[@id=\"idSIButton9\"]")
	   WebElement officesign;
	 
	   @FindBy(how=How.XPATH,using="//*[@id=\"idSubmit_ProofUp_Redirect\"]")
	   WebElement Redirect;
	   
	   @FindBy(how=How.XPATH,using="//*[@id=\"CancelLinkButton\"]")
	   WebElement Cancle;
	   
	   @FindBy(how=How.XPATH,using="//*[@id=\"idSIButton9\"]")
	   WebElement yes;
	   
	   public void officeintro() throws InterruptedException 
	   {
		   
		   ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		   
		   
		   Thread.sleep(5000);
		   
		   WebDriverWait wait = new WebDriverWait(driver,30);
		   wait.until(ExpectedConditions.visibilityOf(office));
		   
		   office.click();

		   
		   
	   }
	   public void gotoemail(String email2) 
	   {
		   officeEmail.sendKeys(email2);
		   Officenext.click();
	   }
	   public void gotopass(String pass2) 
	   {
		   officepass.sendKeys(pass2);
		   officesign.click();
		   Redirect.click();
		   Cancle.click();
		   yes.click();
		   
	   }
	 
}
