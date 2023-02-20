package lbspotman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddPlaza {
	 WebDriver driver;
	 public AddPlaza(WebDriver driver) {
			this.driver=driver;
		}
	 
	By pname1=By.xpath("(//input[@type='text'])[15]");
	By entlane1=By.xpath("(//input[@type='text'])[16]");
	By extlane1=By.xpath("(//input[@type='text'])[17]");
//	By clickadd=By.xpath("(//button[@type='button'][contains(.,'add')])[5]]");
//	By pname2=By.xpath("(//input[@type='text'])[18]");
//	By revlane1=By.xpath("(//input[@type='text'])[19]");
//	By revlane2=By.xpath("(//input[@type='text'])[20]");
	By save=By.xpath("//button[@type='button'][contains(.,'Save')]");
    By next=By.xpath("(//button[@type='button'])[32]");
	public void addzoneplaza1() throws InterruptedException {
		try {
			driver.findElement(pname1).sendKeys("EA MALL Entrance");
			driver.findElement(entlane1).sendKeys("Entry Gate1");
			driver.findElement(extlane1).sendKeys("Exit Gate1");
			Thread.sleep(3000);
			driver.findElement(next).click();
		}
		catch(Exception ex) {
			driver.findElement(pname1).sendKeys("EA MALL Entrance");
			driver.findElement(entlane1).sendKeys("Entry Gate1");
			driver.findElement(extlane1).sendKeys("Exit Gate1");
			Thread.sleep(3000);
			driver.findElement(next).click();
			Thread.sleep(2000);
			driver.findElement(save).click();
			
		}
}
	
	}

