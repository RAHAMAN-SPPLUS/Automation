package accountusers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class saveusers {
	WebDriver driver;
    public saveusers(WebDriver driver) {
 	   this.driver=driver;
    }
 
    By Saveuser=By.xpath("//span[@class='v-btn__content'][contains(.,'Save')]");
    
    public void accountsave()throws InterruptedException {
    	try {
    		driver.findElement(Saveuser).click();
    		Thread.sleep(5000);
    		
    	}
    	catch(Exception e) {
    		driver.findElement(Saveuser).click();
    		Thread.sleep(5000);
    	}
    	
    }
}
