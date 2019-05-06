package com.calender.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/bus-tickets/");
	
	driver.findElement(By.id("txtOnwardCalendar")).click();
	while(!driver.findElement(By.cssSelector("span[id='rb-month']")).getText().contains("August")){
		driver.findElement(By.cssSelector("[class='display_inline_50 calendar full-width'] [class='rb-next active']")).click();
	}
}
}
