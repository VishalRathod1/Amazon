package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\16122018\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.get("https://mail.google.com/mail/");
driver.get("https://accounts.google.com/AccountChooser?service=mail&continue=https://mail.google.com/mail/");

//driver.close();
//driver.quit();
driver.getCurrentUrl();
}
}
