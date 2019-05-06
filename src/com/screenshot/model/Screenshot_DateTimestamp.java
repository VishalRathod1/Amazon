package com.screenshot.model;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_DateTimestamp {
public void captureScreenshot(String filename, String extension) throws IOException{
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String timeStamp=new SimpleDateFormat("YYYY-MM-dd hh-mm-ss").format(new Date());
	FileUtils.copyFile(src, new File("E:\\Selenium\\Screenshot_Selenium\\"+filename+timeStamp+extension));
	System.out.println(timeStamp);
	}
public static void main(String[] args) throws IOException {
	Screenshot_DateTimestamp sc=new Screenshot_DateTimestamp();
	sc.captureScreenshot("Facebook Account", ".jpeg");
	System.out.println("The Screenshot of Facebook homepage is taken successfully");
}
}
