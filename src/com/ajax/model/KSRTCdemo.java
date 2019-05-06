package com.ajax.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSRTCdemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ksrtc.in/oprs-web/");
	
	String title=driver.getTitle();
	System.out.println("The title of this page is:"+title);
	
	WebElement leavingfrom=driver.findElement(By.xpath("//input[@name='fromPlaceName']"));
	leavingfrom.sendKeys("BENG");
	/*String fromCitynm=fromCity.getAttribute("value");
	System.out.println("You have entered city name is:"+fromCitynm);
	fromCity.sendKeys(Keys.DOWN);
	String fromCitynm1=fromCity.getAttribute("value");
	System.out.println("You have entered city name is:"+fromCitynm1);*/
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String script="return document.getElementById(\"fromPlaceName\").value;";
	String text=(String)js.executeScript(script);
	System.out.println(text);
	
	int i=0;
	while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")){
		i++;
		driver.findElement(By.xpath("//input[@name='fromPlaceName']")).sendKeys(Keys.DOWN);
		String text1=(String)js.executeScript(script);
		System.out.println(text1);
		if(i>5){
			break;
		}
		if(i>5){
			System.out.println("element is not found");
		}
		else{
			System.out.println("element is found");
		}
	}
}
}
