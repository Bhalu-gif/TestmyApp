package pagefacory.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SeagenhHomepage 
{
  WebDriver driver ;
public SeagenhHomepage(WebDriver driver) 
{
	this.driver=driver;
}


@FindBy(how=How.XPATH,using="//li[@id=\"menu-item-10\"]//a[@href=\"https://zdapi.appointlink.com?login=login\"]//span[contains(text(),'LOGIN')]")
WebElement Login;



public void Clickologin() throws InterruptedException 
{
	Login.click();
	Thread.sleep(5000);
	
	

}


}
