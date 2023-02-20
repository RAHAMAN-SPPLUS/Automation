package accountusers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class accountpage {
	 WebDriver driver;
     public accountpage(WebDriver driver) {
  	   this.driver=driver;
     }
     By clickaccountpage =By.xpath("//*[contains(text(),'accounts')]");
     By clickaddccount =By.xpath("//i[contains(.,'person_add')]");
     
     public void clickaccpage()throws InterruptedException {
  	   try {
  		   driver.findElement(clickaccountpage).click();
  	   }
  	   catch(Exception e) {
  		   driver.findElement(clickaccountpage).click();  
  	   }
     }
  	   
  	   public void accountadd()throws InterruptedException{
  		   try {
  			 driver.findElement(clickaddccount).click();  
  		   }
  		   catch(Exception e) {
  			 driver.findElement(clickaddccount).click();  
  		   }
  	   }
  	   
     
}



          
           
           
           
