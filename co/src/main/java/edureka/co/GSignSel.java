package edureka.co;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GSignSel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "//Users/haribabuchidipothu/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("hiharibabu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}

}
