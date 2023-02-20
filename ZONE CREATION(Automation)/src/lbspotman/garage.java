package lbspotman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class garage {
	 
 WebDriver driver;

	public garage(WebDriver driver) {
		this.driver=driver;
	 }
	 
	  By dropdownclick=By.xpath("(//i[@aria-hidden='true'])[19]");
      By garages=By.xpath("//input[contains(@autofocus,'autofocus')]");
      By Automation=By.xpath("//div[@class='v-list-item__title'][contains(.,'75547 (EA Mall Automation1)')]");
                             
    
     public void clickingthegaragedropdownclick() throws Throwable
     {
    	 try {
    		 driver.findElement(dropdownclick).click();
    	    }
    	 catch(Exception ex){
    		 driver.findElement(dropdownclick).click();
    	 }
    	
     }
     public void enteringtogarage(String garagecode)
     {
    	 try {
    		 driver.findElement(garages).sendKeys(garagecode);
    	 }catch(Exception e) {
    		 driver.findElement(garages).sendKeys(garagecode);
    	 }
    	 
     }
     public void newzone()
     {
    	 driver.findElement(Automation).click();
     }
     
}
