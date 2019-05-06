package com.dad.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Only_Testing1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
	
	//driver.switchTo().frame(0);
	WebElement source=driver.findElement(By.xpath("//div[@id='dragdiv']"));
	System.out.println("source element located successfully");
	WebElement target=driver.findElement(By.xpath("//div[@id='dropdiv']"));
	System.out.println("target element located successfully");
	Actions action=new Actions(driver);
	System.out.println("action is successfully");
	action.dragAndDrop(source, target).build().perform();
	System.out.println("element is moved successfully");
	
	JavascriptExecutor javascript=(JavascriptExecutor)driver;
	javascript.executeScript("alert('Element is moved on to other place');");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	
	
	
	
}
}
