package accountusers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class accountdetails {
	 WebDriver driver;
     public accountdetails(WebDriver driver) {
  	   this.driver=driver;
     }
     By Fname= By.xpath("(//input[contains(@type,'text')])[3]");
     By Lname= By.xpath("(//input[contains(@type,'text')])[4]"); 
     By clickspotman = By.xpath("//label[contains(.,'Spotman')]");
    
     By clickdropdown =By.xpath("(//i[contains(.,'arrow_drop_down')])[2]");
     By clickdivrt =By.xpath("//div[@class='v-list-item__title'][contains(.,'Divrt')]");
     By email =By.xpath("(//input[contains(@type,'text')])[6]");
     By password =By.xpath("//input[contains(@name,'password')]");
     
     public void accountdetail()throws InterruptedException {
    	 try {
    		 driver.findElement(Fname).sendKeys("Automation");
    		 Thread.sleep(1000);
    		 driver.findElement(Lname).sendKeys("Account");
    		 Thread.sleep(3000);
    		 driver.findElement(clickspotman).click();
    		 Thread.sleep(5000);
    		 driver.findElement(clickdropdown).click();
    		 Thread.sleep(6000);
    		 driver.findElement(clickdivrt).click();
    		 Thread.sleep(3000);
    		 driver.findElement(email).sendKeys("automation@gmail.com");
    		 Thread.sleep(2000);
    		 driver.findElement(password).sendKeys("Auto@123");
    		 Thread.sleep(2000);
    		
    		 }
    	 catch(Exception e) {
    		 driver.findElement(Fname).sendKeys("Automation");
    		 Thread.sleep(1000);
    		 driver.findElement(Lname).sendKeys("Account");
    		 Thread.sleep(3000);
    		 driver.findElement(clickspotman).click();
    		 Thread.sleep(5000);
    		 driver.findElement(clickdropdown).click();
    		 Thread.sleep(6000);
    		 driver.findElement(clickdivrt).click();
    		 Thread.sleep(3000);
    		 driver.findElement(email).sendKeys("automation@gmail.com");
    		 Thread.sleep(2000);
    		 driver.findElement(password).sendKeys("Auto@123");
    		 Thread.sleep(2000);
    		 
    	 }
     }
     
}
