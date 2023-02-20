package accountusers;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class selectallzones {
	 WebDriver driver;
	 public selectallzones(WebDriver driver) {
	  	   this.driver=driver;
	     }

	 By garagename =By.xpath("(//input[contains(@type,'text')])[7]");
	 By UAT99999 = By.xpath("(//div[contains(@class,'ripple')])[7]");
	 By QA99999 =By.xpath("(//div[contains(@class,'ripple')])[8]");
	 By COMM62276 =By.xpath("(//div[contains(@class,'ripple')])[6]");
	 
	 
	public void zoneclick() throws InterruptedException {
	
		try {
			
	  		   driver.findElement(garagename).sendKeys("99999");
	  		   Thread.sleep(2000);
	  		   driver.findElement(UAT99999).click();
	  		   Thread.sleep(2000);
	  		   driver.findElement(QA99999).click();
	  		   Thread.sleep(4000);
	  		   
	  		 
	  		WebElement we=driver.findElement(garagename);
	  		 
	  		String s = Keys.chord(Keys.CONTROL, "a");
	  		we.sendKeys(s);  
	  		
	  		Thread.sleep(1000);
	  		
	  		we.sendKeys(Keys.BACK_SPACE);
	  		 
	  		   
	  		  driver.findElement(garagename).sendKeys("62276");
	  		  Thread.sleep(1000);
	  		  driver.findElement(COMM62276).click();
	  		   
	  	   }
	  	   catch(Exception e) {
	  		 
	  		   driver.findElement(garagename).sendKeys("99999");
	  		   Thread.sleep(2000);
	  		   driver.findElement(UAT99999).click();
	  		   Thread.sleep(2000);
	  		   driver.findElement(QA99999).click();
	  		   Thread.sleep(4000);
	  		  
	  		 WebElement we=driver.findElement(garagename);
	  		 
		  		String s = Keys.chord(Keys.CONTROL, "a");
		  		we.sendKeys(s);  
		  		
		  		Thread.sleep(1000);
		  		
		  		we.sendKeys(Keys.BACK_SPACE);
	  		   
	  		   driver.findElement(garagename).sendKeys("62276");
	  		   Thread.sleep(1000);
	  		   driver.findElement(COMM62276).click();
	  		   
	  	   }
		
	}
		
		
}


