package mainexecute;
import java.time.Duration;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


import accountusers.login;
import accountusers.saveusers;
//import accountusers.saveusers;
import accountusers.selectallzones;
import accountusers.accountdetails;
import accountusers.accountpage;
public class Accountpage {

	public static void main(String[] args) throws  Throwable{

		System.setProperty("webdriver.chrome.driver","C://Users//raham//OneDrive//Desktop//chromedriver folder//chromedriver.exe");

		ChromeOptions option=new ChromeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NONE); 
		WebDriver driver=new ChromeDriver();
         
        driver.get("https://lbspotman-dev.divrt.co");
        driver.manage().window().maximize();  
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(1000); 
        
          login obj1=new login(driver);
          obj1.enterusername("rahaman@divrt.co");
          obj1.enterpass("Shakil@786");
          obj1.lgn();
          
          
          
          accountpage obj2=new accountpage(driver);
          obj2.clickaccpage();
          Thread.sleep(3000);
          obj2.accountadd();
          
          accountdetails ob3=new accountdetails(driver);
          ob3.accountdetail();
          
          
          selectallzones ob4 =new selectallzones(driver);
          ob4.zoneclick();         
          
          Actions d = new Actions(driver);
          d.sendKeys(Keys.PAGE_DOWN).build().perform();
          
          saveusers ob5 =new saveusers(driver);
          ob5.accountsave();
          

	}
}
