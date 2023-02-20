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
      By QA99999=By.xpath("//div[@class='v-list-item__content'][contains(.,'99999 (SphereVille Garage(QA))')]");

     public void clickingthegaragedropdownclick() throws Throwable
     {
    	driver.findElement(dropdownclick).click();
     }
     public void enteringtogarage(String garagename)
     {
    	 driver.findElement(garages).sendKeys(garagename);
     }
     public void uatsphere()
     {
    	 driver.findElement(QA99999).click();
     }
     
}



