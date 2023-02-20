package lbspotman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class login {
	
		 WebDriver driver;
		 
		 public login(WebDriver driver){
			 this.driver=driver;
		 }
		         By username=By.xpath("//*[@autofocus='autofocus']");
				 By password=By.xpath("//*[@name='password']");
				 By loginbtn=By.xpath("//button[@type='button'][contains(.,'Log in')]");
				
				public void enterusername(String usern) {
						driver.findElement(username).sendKeys(usern);
				 }
				public  void enterpass(String pass) {
					driver.findElement(password).sendKeys(pass);
				}
				public  void lgn() {
					driver.findElement(loginbtn).click();
				}
				
					
				
}
