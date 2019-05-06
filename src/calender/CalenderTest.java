package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.path2usa.com/travel-companions");
	driver.manage().window().maximize();
	WebElement travelfrom=driver.findElement(By.id("travel_from"));
	travelfrom.sendKeys("Pune");
	Thread.sleep(5000);
	travelfrom.sendKeys(Keys.DOWN);
	travelfrom.sendKeys(Keys.ENTER);
	String s=travelfrom.getAttribute("value");
	System.out.println("the travel from city is"+travelfrom);
	
	WebElement travelto=driver.findElement(By.id("travel_to"));
	travelto.sendKeys("Los Angeles");
	Thread.sleep(5000);
	travelto.sendKeys(Keys.DOWN);
	travelto.sendKeys(Keys.TAB);
	String s1=travelto.getAttribute("value");
	System.out.println("the travel to city is"+travelto);
	
	driver.findElement(By.id("travel_date"));
	while(!driver.findElement(By.cssSelector("[class='datepicker-switch']")).getText().contains("May")){
		driver.findElement(By.cssSelector("[class='datepicker-days'][class='Next']")).click();
	}
	List<WebElement> ls=(List<WebElement>) driver.findElement(By.className("day"));
	int count=ls.size();
	System.out.println("The number of days:"+ls.size());
	for(int i=0;i<count;i++){
		String s2=driver.findElements(By.className("day")).get(i).getText();
		if(s2.equalsIgnoreCase("23")){
			driver.findElements(By.className("day")).get(i).click();
		}
	}
	
}
}
