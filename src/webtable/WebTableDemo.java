package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///E:/Selenium/webTable.html");
	
	List<WebElement> ls=driver.findElements(By.tagName("tr"));
	int rowcount=ls.size();
	System.out.println("the no. of rows in the table:"+rowcount);
	
	for(WebElement row:ls){
		List<WebElement> ls1=row.findElements(By.tagName("td"));
		System.out.println("the no. of column in the row:"+ls1.size());
		
		for(WebElement column:ls1){
			System.out.println(column.getText());
		}
	}
}
}
