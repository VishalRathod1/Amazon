package com.alert.model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	
	/*driver.findElement(By.cssSelector("div.rediffmail-logo"));
	String title=driver.getTitle();
	System.out.println("The title of this page is:"+title);
	
	WebElement username=driver.findElement(By.cssSelector("div[class='f14 bold form-label']"));
	String usernameText=username.getText();
	System.out.println("Enter your "+usernameText);
	driver.findElement(By.cssSelector("input#login1")).sendKeys("vishurathod111@rediffmail.com");
	System.out.println("The username is entered successfully");
	
	WebElement password=driver.findElement(By.xpath("//div[@class='floatL bold']"));
	String passwordText=password.getText();
	System.out.println("Enter your "+passwordText);
	driver.findElement(By.id("password")).sendKeys("QA@2019");
	System.out.println("The password is entered successfully");
	
	driver.findElement(By.id("remember")).click();
	System.out.println("The Remember me is unchecked successfully");
	
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	System.out.println("The submit button is clicked successfully");
	
	driver.navigate().back();
	*/
	WebElement loginform=driver.findElement(By.xpath("//div[@class='rediffmail-logo']"));
	String title=driver.getTitle();
	System.out.println("The title of this page is:"+title);
	
	driver.findElement(By.xpath("//input[@value='Go']")).click();
	driver.switchTo().alert().accept();
	System.out.println("The alert window is handled successfully");
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	
}
}
