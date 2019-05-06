package com.cricbuzz.model;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\16122018\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-shri-lanka-inuae-2017");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		//to get title of the webpage
		String titleHomepage=driver.getTitle();
		System.out.println("The title of the webpage is:"+titleHomepage);
		
		//to check current url of the page
		String urlHomepage=driver.getCurrentUrl();
		System.out.println("The current URL of the webpage is:"+urlHomepage);
		
		//to find number of hyperlinks on webpage
		List<WebElement> hyperlinkHomepage=driver.findElements(By.tagName("a"));
		int hyperlinkHomepageCount=hyperlinkHomepage.size();
		System.out.println("The total number of hyperlinks on the webpage are:"+hyperlinkHomepageCount);
				
		//find number of rows in a table
		WebElement table=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		List<WebElement> rowCount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int count=rowCount.size();
		System.out.println(count);
		
		int sum=0;
		for(int i=0;i<count-2;i++){
			String total=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int val=Integer.parseInt(total);
			sum=sum+val;
      	    System.out.println("The sum is:"+sum);
			
		}
		String extra=table.findElement(By.xpath("//div[@id='innings_1']/div[1]/div[14]/div[2]")).getText();
		int extraRun=Integer.parseInt(extra);
		System.out.println("Extra runs are:"+extraRun);
		
		int total=sum+extraRun;
		System.out.println("The totalrun with extras are:"+total);
		
		String total1=table.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText();
		int totalRun=Integer.parseInt(total1);
		System.out.println("Total runs are:"+totalRun);

		if(totalRun==total)
		{
			System.out.println("Total run is matched with addition of individual playes run");
		}
		else{
			System.out.println("Run not matched");
		}
	}

}
