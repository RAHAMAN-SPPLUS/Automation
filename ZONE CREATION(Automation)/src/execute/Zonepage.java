package execute;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import lbspotman.ZoneDetails;
import lbspotman.finalsave;
import lbspotman.garage;
import lbspotman.livepage;
import lbspotman.login;
import lbspotman.poc;
import lbspotman.zonelistpage;
import lbspotman.ZoneConfig;
import lbspotman.AddPlaza;

public class Zonepage {
	public static void main(String[] args) throws  Throwable{
//		System.setProperty("webdriver.chrome.driver","C://Users//raham//Downloads//chromedriver_win32//chromedriver.exe" );
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
          
          Thread.sleep(3000); 
          ZoneDetails obj2 =new ZoneDetails(driver);
          obj2.clickzonelist();
          
          obj2.clickaddzone();
          obj2.addingzonedetails();
          
          try {
        	  Actions upside = new Actions(driver);
              upside.sendKeys(Keys.PAGE_UP).build().perform();
          }catch(org.openqa.selenium.ElementNotInteractableException ex) {
        	  Actions upside = new Actions(driver);
              upside.sendKeys(Keys.PAGE_UP).build().perform();
          }
          
          
          ZoneConfig obj3=new ZoneConfig(driver);
          obj3.addzoneconfig();
          
          Thread.sleep(3000);
          
          Actions d = new Actions(driver);
          d.sendKeys(Keys.PAGE_DOWN).build().perform();
          poc obj4=new poc(driver);
          obj4.pocdetails();
          
          AddPlaza ob5=new AddPlaza(driver);
          ob5.addzoneplaza1();
          
          Actions a = new Actions(driver);
          a.sendKeys(Keys.PAGE_DOWN).build().perform();
          
          finalsave obj6=new finalsave(driver);
          obj6.clicksave();
          Thread.sleep(10000);
          
          
           zonelistpage obj7 = new zonelistpage(driver);
           obj7.searchnewzone();
           Thread.sleep(20000);
           
           livepage obj8=new livepage(driver);
           obj8.clicklivepage();
           Thread.sleep(10000);

         
          garage obj9=new garage(driver);
          obj9.clickingthegaragedropdownclick();  
          obj9.enteringtogarage("");
          obj9.newzone(); 
          Thread.sleep(10000);
          
          
          
          driver.quit();
          
	}

	
	}
