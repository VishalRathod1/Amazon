package com.webtable.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentWebTableDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///E:/Selenium/WebTableDemo.html");
	
	List<WebElement> rows=driver.findElements(By.tagName("tr"));
	int rowCount=rows.size();
	System.out.println("The total number of rows are:"+rowCount);
	
	for(WebElement row:rows){
		List<WebElement> columns=driver.findElements(By.tagName("td"));
		for(WebElement column:columns){
			System.out.println(column.getText());
		}
		
	}
}
}
