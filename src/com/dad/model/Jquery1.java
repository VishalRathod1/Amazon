package com.dad.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	
	WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
	Actions action=new Actions(driver);
	action.dragAndDropBy(draggable, 160, 0).build().perform();
    JavascriptExecutor javascript=(JavascriptExecutor)driver;
    javascript.executeScript("alert('element is moved by 160 pixels in x-direction');");
    Thread.sleep(5000);
    driver.switchTo().alert().accept();
    
    new Actions(driver).dragAndDropBy(draggable, 0, 160).build().perform();
    javascript.executeScript("alert('element is moved by 160 pixels in y-direction');");
    Thread.sleep(5000);
    driver.switchTo().alert().accept();
    
    new Actions(driver).dragAndDropBy(draggable, -160, -160).build().perform();
    javascript.executeScript("alert('element is moved to its original position');");
    Thread.sleep(5000);
    driver.switchTo().alert().accept();
    
    
	
}
}
