package dad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dad {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("content");
	WebElement source=driver.findElement(By.id("container"));
	WebElement target=driver.findElement(By.id("droppable"));
	Actions action=new Actions(driver);
	action.dragAndDrop(source, target).build().perform();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("https://jqueryui.com/about/")).click();
	
}
}
