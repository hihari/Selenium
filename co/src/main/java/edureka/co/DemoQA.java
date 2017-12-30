package edureka.co;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver;
		  System.setProperty("webdriver.gecko.driver","/Users/haribabuchidipothu/Downloads/geckodriver");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			 	
			Thread.sleep(1000);
			driver = new FirefoxDriver(capabilities);
		    driver.get("http://demoqa.com/registration/");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		   List<WebElement> sel= driver.findElements(By.xpath("//input[@name='radio_4[]']"));
		   for(WebElement s: sel){
			   if (s.getAttribute("value").equals("married")){
				   s.click();
			   }
		   }
		  
	}

}
