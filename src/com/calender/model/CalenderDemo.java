package com.calender.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input[id='datepicker']")).click();
		
		while(!driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText().contains("August")){
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		List<WebElement> ls=driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
		int count=ls.size();
		System.out.println("The total number of days are:"+count);
		
		for(int i=0;i<count;i++){
			String text=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			if(text.equalsIgnoreCase("23")){
				driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
			}
		}
		
	}

}
