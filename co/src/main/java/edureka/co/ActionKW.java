package edureka.co;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.lang.reflect.Method;



public class ActionKW {
	
	public static WebDriver driver;
	
	public static void OpenBrowser(String obj,String data){
		
		try{
			if(data.equals("Mozilla")){
				System.setProperty("webdriver.gecko.driver", "/Users/haribabuchidipothu/Downloads/geckodriver");
				DesiredCapabilities dc = DesiredCapabilities.firefox();
				dc.setCapability("marionette", true);
				driver = new FirefoxDriver();		
						}
			}
		catch(Exception e){
			e.printStackTrace();
			}
		
	}
	
	public static void navigateURL(String obj,String data){
		try{
			driver.get(data);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		
		ActionKW.OpenBrowser("", "Mozilla");
		ActionKW.navigateURL("", "http://google.com");
	}

}
