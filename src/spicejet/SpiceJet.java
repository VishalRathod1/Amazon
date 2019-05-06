package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	
	WebElement departureCity=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
	departureCity.sendKeys("Mumbai");
	Thread.sleep(5000);
	departureCity.sendKeys(Keys.DOWN);
	departureCity.sendKeys(Keys.ENTER);
	
	WebElement arrivalCity=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
	arrivalCity.sendKeys("Bangkok");
	Thread.sleep(5000);
	departureCity.sendKeys(Keys.DOWN);
	departureCity.sendKeys(Keys.ENTER);
	
	/*driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']"));
	driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
	driver.findElement(By.xpath("//span[@class='btn-find-flight-home']"));
	*/
	
	
	
}
}
