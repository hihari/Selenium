package edureka.co;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;


public class App {
	WebDriver driver;
	
	public void launch() throws Exception{
	    System.setProperty("webdriver.gecko.driver","/Users/haribabuchidipothu/Downloads/geckodriver");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		 	
		Thread.sleep(1000);
		driver = new FirefoxDriver(capabilities);
	    driver.get("http://www.newtours.demoaut.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='userName' And @type='text']")).sendKeys("Mercury");
		driver.findElement(By.xpath("//input[@name='password' And @type='password']")).sendKeys("Mercry");
		driver.findElement(By.xpath("//input[@name='login' And @value='login']")).click();
		}
	public void login(){
		//--//input[@name='userName' And @type='text']
		//--//input[@name='password' And @type='password']
		//--//input[@name='login' And @value='login']
		driver.findElement(By.xpath("//input[@name='userName' And @type='text']")).sendKeys("Mercury");
		driver.findElement(By.xpath("//input[@name='password' And @type='password']")).sendKeys("Mercry");
		driver.findElement(By.xpath("//input[@name='login' And @value='login']")).click();
		
	}

	public void close(){
		driver.close();
	}


    public static void main( String[] args ) throws InterruptedException
    {
    	
        System.out.println( "Hello World!" );
        App ap = new App();
        try {
			ap.launch();
			ap.login();
			ap.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.manage().window().maximize();
   
        
        
    }
}
