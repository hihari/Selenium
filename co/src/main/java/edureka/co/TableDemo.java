package edureka.co;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TableDemo {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.gecko.driver", "/Users/haribabuchidipothu/Downloads/geckodriver");
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability("marionette", true);
		
		WebDriver driver = new FirefoxDriver(dc);
		driver.get("http://toolsqa.com/automation-practice-table/#");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr"));
		System.out.println(rows.size());
		for (WebElement row : rows){
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for (WebElement col : cols){
				System.out.println(col.getText());
			}
		}
		
	}

}
