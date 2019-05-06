package com.dad.model;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.handler.MovedContextHandler;

public class Only_Testing {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
	driver.manage().window().maximize();
	
	WebElement dragable=driver.findElement(By.xpath("//div[@id='dragdiv']"));
	//move element by 100 pixels in horizontal direction
	Actions action=new Actions(driver);
	action.dragAndDropBy(dragable, 160, 0).build().perform();
	//to generate javascript alert
	JavascriptExecutor javascript=(JavascriptExecutor)driver;
	javascript.executeScript("alert('element is moved by 160 pixels in x-direction');");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	//move element by 100 pixels in vertical direction
	new Actions(driver).dragAndDropBy(dragable, 0, 160).build().perform();
	//javascript alert
	javascript.executeScript("alert('element is moved by 160 pixels in y-direction');");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	//move element by -160 pixels in x-direction and y-direction
	new Actions(driver).dragAndDropBy(dragable, -160, -160).build().perform();
	javascript.executeScript("alert('element is moved to its original position');");
	driver.switchTo().alert().accept();
	
	
	
}
}
