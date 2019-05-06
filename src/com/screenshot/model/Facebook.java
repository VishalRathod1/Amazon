package com.screenshot.model;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Config.driver.manage().window().maximize();
		Config.driver.get("https://www.facebook.com/");

		Facebook_Screenshot fsc = new Facebook_Screenshot();
		fsc.captureScreenshot("Fb_Login_Page", ".jpeg");

		Config.driver.findElement(By.linkText("Forgotten account?")).click();
		Config.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		fsc.captureScreenshot("Forgot_Password", ".jpeg");

		Config.driver.navigate().back();

		String url = driver.getCurrentUrl();
		System.out.println("The url of webpage is:" + url);

	}

}
