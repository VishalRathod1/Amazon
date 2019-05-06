package dad;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dadBy {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
	driver.manage().window().maximize();
	
	WebElement draganddrop=driver.findElement(By.id("dragdiv"));
	Actions action=new Actions(driver);
	action.dragAndDropBy(draganddrop, 150, 0).build().perform();
	JavascriptExecutor javascript=(JavascriptExecutor)driver;
	javascript.executeScript("alert('the element is moved by 100 pixels in horizontal direction');");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	
	new Actions(driver).dragAndDropBy(draganddrop, 0, 150).build().perform();
	javascript.executeScript("alert('the element is moved by 100 pixels in vertical direction');");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	
//	new Actions(driver).dragAndDropBy(draganddrop, -150, -150).build().perform();
	action.dragAndDropBy(draganddrop, -150, -150).build().perform();
    javascript.executeScript("alert('the element is moved on its original position');");
    Thread.sleep(5000);
	driver.switchTo().alert().accept();
	
}
}
