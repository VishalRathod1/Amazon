package com.amazonAction.model;


import org.openqa.selenium.interactions.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	
	List<WebElement> ls=driver.findElements(By.tagName("a"));
	int count=ls.size();
	System.out.println("The number of hyperlinks on the Amazon website are:"+count);
	
	String title_Amazon=driver.getTitle();
	System.out.println("The title of the Amazon website is:"+title_Amazon);
	
	String url_Amazon=driver.getCurrentUrl();
	System.out.println("The current url of the Amazon website is:"+url_Amazon);
	
	WebElement your_Amazon=driver.findElement(By.xpath("//a[@id='nav-your-amazon']"));
	Actions action_DoubleClick=new Actions(driver);
	action_DoubleClick.doubleClick(your_Amazon).build().perform();
	System.out.println("Double Clicked on Your Amazon.in");
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#ap_email")));
	String title_login=driver.getTitle();
	System.out.println("The title of the Login page is:"+title_login);
	driver.navigate().back();
	Thread.sleep(5000);
	
	WebElement customer_Service=driver.findElement(By.xpath("//a[@class='nav-a'][.='Customer Service']"));
	Actions action_RightClick=new Actions(driver);
    Action rightclick=action_RightClick.contextClick(customer_Service).build();
    rightclick.perform();	
    System.out.println("Right Clicked on Customer Service");
    
    WebElement your_Orders=driver.findElement(By.xpath("//span[@class='nav-line-1'][.='Hello, Sign in']"));
	Actions action_MoveToElement=new Actions(driver);
	Action mousehover=action_MoveToElement.moveToElement(your_Orders).build();
	mousehover.perform();
	Thread.sleep(5000);
	System.out.println("Cursor is moved to Your Order menu");
	driver.findElement(By.xpath("//span[@class='nav-text'][.='Your Orders']")).click();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	System.out.println("Clicked on to Your Order menu");
	
	WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
	boolean act_Flag=email.isDisplayed();
	if(act_Flag){
		email.sendKeys("vishurathod111@gmail.com");
		}
	
	/*WebElement your_Orders=driver.findElement(By.xpath("//span[@class='nav-line-1'][.='Hello, Sign in']"));
	Actions mousehover=new Actions(driver);
	mousehover.moveToElement(your_Orders).build().perform();
	
	driver.findElement(By.xpath("//span[@class='nav-text'][.='Your Orders']")).click();
	mousehover.build().perform();
	driver.navigate().back();*/
	
}
}
