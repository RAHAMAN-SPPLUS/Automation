package executetest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import lbspotman.garage;
import lbspotman.loginflows1;
import lbspotman.parking;
import lbspotman.bookingid;



public class spotlogin {
 
	
	public static void main(String[] args) throws  Throwable{
		System.setProperty("webdriver.chrome.driver","C://Users//raham//OneDrive//Documents//chromedriver.exe" );
//		System.setProperty("wedriver.firefox.driver","C://Users//raham//Downloads//geckodriver-v0.32.0-win32.exe");
		
         WebDriver driver=new ChromeDriver();
        driver.get("https://lbspotman-dev.divrt.co");
        driver.manage().window().maximize();  
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    	
         loginflows1 obj1=new loginflows1(driver);
         obj1.enterusername("rahaman@divrt.co");
         obj1.enterpass("Shakil@786");
         obj1.lgn();
       
     	Thread.sleep(10000);
         
         garage ob2=new garage(driver);
         ob2.clickingthegaragedropdownclick();          
         ob2.enteringtogarage("QA");
         ob2.uatsphere(); 
         Thread.sleep(2000);
         
         bookingid obj3=new bookingid(driver);
         obj3.searchbookingid("3wETlox9Aq");
         obj3.clickbookingid();
         Thread.sleep(3000);
         
         parking obj4=new parking(driver);
         obj4.clickcard();          
	}
}
