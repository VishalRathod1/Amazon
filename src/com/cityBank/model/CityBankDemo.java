package com.cityBank.model;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CityBankDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.online.citibank.co.in/");
		
		String homePageTitle=driver.getTitle();
		System.out.println("The Title of Home Page is:"+homePageTitle);
		
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//span[@class='txtSign']")).click();
		String loginTitle=driver.getTitle();
		System.out.println("The Title after clicking on login button is:"+loginTitle);
		Thread.sleep(5000);
		
		Set<String> windowList=driver.getWindowHandles();
		Iterator<String> itr=windowList.iterator();
		while(itr.hasNext()){
			String childWindow=itr.next();
			if(parentWindow.equalsIgnoreCase(childWindow)){
				driver.switchTo().window(childWindow);
				System.out.println("hehehehe");
				Thread.sleep(5000);
				WebElement newWindow=driver.findElement(By.xpath("//div[@class='intr_sec1']"));
			    String vishal=newWindow.findElement(By.xpath("//div[@class='uid']")).getText();
			    System.out.println(vishal);
			    newWindow.findElement(By.id("User_Id")).sendKeys("vishal");
			}
		}

		
		//WebElement userId=driver.findElement(By.xpath("//div[@class='fl width189']/input"));
		//userId.sendKeys("vishal");
		
	}

}
