package com.dad.model;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.handler.MovedContextHandler;

public class Jquery {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	
	//to get acess inside the frame
	driver.switchTo().frame(0);
	System.out.println("Inside the frame");
	//to find locators of source element
	WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
	System.out.println("source element located successfully");
	//to find locators of target element
	WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
	System.out.println("target element located successfully");
	//to perform action
	Actions action=new Actions(driver);
	//to perform drag and drop action
	action.dragAndDrop(source, target).build().perform();
	System.out.println("Drag and Drop action is performed successfully");
	//to generate javascript alert
	JavascriptExecutor javascript=(JavascriptExecutor)driver;
	javascript.executeScript("alert('Element is moved on to other place');");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	//to get back out of the frame
	driver.switchTo().defaultContent();
	System.out.println("Out of the frame");
	WebElement about=driver.findElement(By.partialLinkText("About"));
	action.click(about).build().perform();
}
}
