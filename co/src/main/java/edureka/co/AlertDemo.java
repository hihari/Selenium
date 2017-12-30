package edureka.co;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","/Users/haribabuchidipothu/Downloads/geckodriver");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		 	
		
		WebDriver driver = new FirefoxDriver(capabilities);
	    driver.get("https://www.skyscanner.com/");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='js-depart-input']")).click();
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".current")));
	    
	    
	    String eMonth = driver.findElement(By.cssSelector(".current")).getText();
	 
	    
	    if (eMonth.equals("August 2018")){
	    	System.out.println("Month is already selected");
	    }
	    else
	    { 
	    	for(int i=1; i<=12; i++){
	    		driver.findElement(By.cssSelector(".next")).click();
	    		eMonth = driver.findElement(By.cssSelector(".current")).getText();
	    		if (eMonth.equals("August 2018")){
	    			break;
	    		}
	    	}
	    	
	    }
	    
	    Thread.sleep(3000);   
	    //data-id="2017-09-25"
	    String eDay = "2018-08-15";
	   List<WebElement> al = driver.findElements(By.cssSelector(".day"));
	   
	   for (int j=0; j< al.size();j++){
		   if(al.get(j).getAttribute("data-id").equals(eDay)){
			   al.get(j).click();
			   break;
		   }
	   }
	    		
	    
	  
	  
	    
	    
	    
	    
	 
	
	    
	    
	    
	    Thread.sleep(2000);
	     
	    driver.quit();
	   
	    
	    
	    
	    
	}

}
