package com.datePicker.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(5000);
		
		List<WebElement> firstRowDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));
		int count=firstRowDates.size();
		System.out.println("The number of dates in first row are:"+count);
		
		System.out.println("Following are the dates:");
		for(WebElement firstRow:firstRowDates){
			String date=firstRow.getText();
			System.out.println(date);
			
		}
		
		

	}

}
