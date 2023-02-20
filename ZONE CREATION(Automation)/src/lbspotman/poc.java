package lbspotman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class poc {
	
	
	WebDriver driver;
	 public poc(WebDriver driver) {
			this.driver=driver;
		}
	By name =By.xpath("(//input[@type='text'])[11]");
	By contact=By.xpath("(//input[contains(@type,'text')])[13]");
	By Email=By.xpath("(//input[@type='text'])[14]");
	By nextpage=By.xpath("(//button[contains(@type,'button')])[22]");
	
	
	public void pocdetails()
	{
		driver.findElement(name).sendKeys("Praveen");
		driver.findElement(contact).sendKeys("7894567894");
		driver.findElement(Email).sendKeys("praveen@divrt.co");
		driver.findElement(nextpage).click();
	}
	

}
