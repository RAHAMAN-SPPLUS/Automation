package lbspotman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class bookingid {
    
	WebDriver driver;
   
    public bookingid(WebDriver driver) {
    	this.driver=driver;
    }
    
    By searchbookid=By.xpath("(//input[contains(@type,'text')])[8]");
    By oneid=By.xpath("//a[@href='https://sppl-dev.divrt.co/g/3wETlox9Aq'][contains(.,'3wETlox9Aq')]");
  
    
    public void searchbookingid(String bid) {

    	driver.findElement(searchbookid).sendKeys(bid);
    }
    public void clickbookingid() {
    	driver.findElement(oneid).click();
    }
    
}
