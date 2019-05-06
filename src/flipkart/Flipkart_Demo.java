package flipkart;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Demo {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	System.out.println("Welcome to Flipkart");
	
	//to close the login window
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	//to move the cursor on Electronics menu
	WebElement mobile_MI=driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
	Actions action=new Actions(driver);
	action.moveToElement(mobile_MI).build().perform();
	Thread.sleep(5000);
	
	//to click on to the MI menu
	driver.findElement(By.xpath("//ul[@class='QPOmNK']/li[2]/a")).click();
	Thread.sleep(5000);
	System.out.println("The list of MI mobile is displayed successfully");
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("E:\\Selenium\\Screenshot_Selenium\\MI_Mobiles.jpeg"));
	
	//to generate javascript alert for List of MI mobile
	JavascriptExecutor javascript=(JavascriptExecutor)driver;
	javascript.executeScript("alert('List of MI mobile is displayed');");
	Thread.sleep(5000);
    driver.switchTo().alert().accept();
    System.out.println("Alert for list of MI mobile is accepted successfully");
    
    System.out.println("Following is a list for MI mobile");
    //to make a list to display on console
	List<WebElement> ls=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	Iterator itr=ls.iterator();
	while(itr.hasNext()){
		WebElement mobile=(WebElement)itr.next();
		String mi=mobile.getText();
		System.out.println(mi);
	}
	System.out.println("The List for MI mobile is displayed successfully");
	
	//to navigate back to Flipkart homepage
	driver.navigate().back();
	
	//to move the cursor on Electronics menu
	WebElement mobile_SAMSUNG=driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
	Actions action1=new Actions(driver);
	action1.moveToElement(mobile_SAMSUNG).build().perform();
	Thread.sleep(5000);
	
	//to click on to the SAMSUNG menu
	driver.findElement(By.xpath("//ul[@class='QPOmNK']/li[4]/a")).click();
	Thread.sleep(5000);
	System.out.println("The list of SAMSUNG mobiles are displayed successfully");
	
	//to generate javascript alert for List of SAMSUNG mobile 
	JavascriptExecutor javascript1=(JavascriptExecutor)driver;
	javascript1.executeScript("alert('List of SAMSUNG mobile is displayed');");
	Thread.sleep(5000);
    driver.switchTo().alert().accept();
    System.out.println("Alert for list of SAMSUNG mobile is accepted successfully");
    
    System.out.println("Following is a list for SAMSUNG mobile");
  //to make a list for SAMSUNG to display on console
	List<WebElement> ls1=driver.findElements(By.cssSelector("a[class='_2cLu-l']"));
	Iterator itr1=ls1.iterator();
	while(itr1.hasNext()){
		WebElement mobile1=(WebElement)itr1.next();
		String samsung=mobile1.getText();
		System.out.println(samsung);
	}
	System.out.println("List for SAMSUNG mobile is displayed successfully");
	
	//to navigate back to Flipkart homepage
	driver.navigate().back();
}
}
