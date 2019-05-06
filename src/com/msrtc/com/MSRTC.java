package com.msrtc.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MSRTC {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://msrtc.maharashtra.gov.in/");
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@id='from_txt']")).sendKeys("Pune");
	driver.findElement(By.xpath("//input[@id='to_txt']")).sendKeys("Solapur");
}
}
