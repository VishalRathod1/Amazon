package com.scope.model;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		String title=driver.getTitle();
		System.out.println("The title of this page is:"+title);
		
		int count1=driver.findElements(By.tagName("a")).size();
		System.out.println("The total number of huperlinks on this page are:"+count1);
		
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		int count2=footer.findElements(By.tagName("a")).size();
		System.out.println("The total number of huperlinks on this page are:"+count2);
		
		WebElement column=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul"));
		int count3=column.findElements(By.tagName("a")).size();
		System.out.println("The total number of huperlinks on this page are:"+count3);
		
		for(int i=0;i<count3;i++){
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(5000);	
		}
		
		Set<String> abc=driver.getWindowHandles();
		Iterator itr=abc.iterator();
		while(itr.hasNext()){
			driver.switchTo().window((String) itr.next());
			System.out.println(driver.getTitle());
			
		}
		

	}

}
