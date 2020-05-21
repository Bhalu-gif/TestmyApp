package pagefacory.fastest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeSuite;

public class Testbase
{
	
	public static WebDriver driver = null;
    @BeforeSuite
    public void initiallization() throws InterruptedException
    {
      System.setProperty("webdriver.chrome.driver","F:\\version\\chromedriver_win32 (1)\\chromedriver.exe");
  	  driver = new ChromeDriver();
  	  driver.get("https://www.seatgen.com/");
  	  Thread.sleep(3000);
  	  driver.manage().window().maximize();
  	 
     }
    
    
}
