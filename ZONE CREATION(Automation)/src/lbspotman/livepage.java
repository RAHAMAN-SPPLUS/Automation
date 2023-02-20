package lbspotman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class livepage {
           WebDriver driver;
           public livepage(WebDriver driver) {
        	   this.driver=driver;
           }
           By livepage =By.xpath("(//i[contains(@aria-hidden,'true')])[4]");
           
           
           public void clicklivepage()throws InterruptedException {
        	   try {
        		   driver.findElement(livepage).click();
        	   }
        	   catch(Exception e) {
        		   driver.findElement(livepage).click();  
        	   }
        	   
           }
           
           
           
}
