package lbspotman;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ZoneDetails {
	WebDriver driver;
	 
	 public ZoneDetails(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 By zonelist =By.xpath("(//i[contains(@aria-hidden,'true')])[9]");
	 By addzonelist =By.xpath("//span[contains(.,'Add Zone add')]");
	 By name =By.xpath("(//input[@type='text'])[1]");
	 By shortname =By.xpath("(//input[contains(@type,'text')])[2]");
	 By address=By.xpath("//textarea[@rows='3']");
	 By Zcode =By.xpath("(//input[@type='text'])[8]");

     By cap =By.xpath("//input[@type='number']");
     By gateclick =By.xpath("(//i[@aria-hidden='true'])[24]");
     By selectgate = By.xpath("//div[@class='v-list-item__title'][contains(.,'Elka')]");
	 By nextpage=By.xpath("(//button[@type='button'])[17]");
	 public void clickzonelist() {
		 driver.findElement(zonelist).click();
	 }
	 public void clickaddzone() {
		 driver.findElement(addzonelist).click();
	 }
	 public void addingzonedetails() throws InterruptedException {
		 try {
			 driver.findElement(name).sendKeys("Spencerplaza");
			 driver.findElement(shortname).sendKeys("spencer");
			 driver.findElement(address).sendKeys("New York",Keys.ENTER);
			 driver.findElement(Zcode).sendKeys("97918");
			 driver.findElement(cap).sendKeys("120");
			 driver.findElement(gateclick).click();
			 Thread.sleep(3000);
			 driver.findElement(selectgate).click();
			
			}
			catch(Exception ex)
			{
				driver.findElement(name).sendKeys("Spencerplaza");
				 driver.findElement(shortname).sendKeys("spencer");
				 driver.findElement(address).sendKeys("New York",Keys.ENTER);
				 driver.findElement(Zcode).sendKeys("97918");
				 driver.findElement(cap).sendKeys("120");
				 driver.findElement(gateclick).click();
				 Thread.sleep(3000);
				 driver.findElement(selectgate).click();
				 
			}
		   try {
			   Thread.sleep(2000);
			   driver.findElement(nextpage).click();
			   
		   }
		   catch(org.openqa.selenium.ElementNotInteractableException e) {
			   Thread.sleep(2000);
			   driver.findElement(nextpage).click();
		   }
		 
		 
//		 Thread.sleep(2000);
//		 driver.findElement(tmzsoff).sendKeys();
		


	}
}
