package com.alert.model;

import java.awt.List;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TizagAlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.switchTo().alert().accept();
		String confirmtext=driver.findElement(By.xpath("//input[@type='button']")).getText();
		System.out.println(confirmtext);

		
	}

}
