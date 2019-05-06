package windowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAClickAcademy {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.qaclickacademy.com/practice.php");
	driver.manage().window().maximize();
	
	//List<WebElement> ls=driver.findElements(By.tagName("a"));
	WebElement footdriver=driver.findElement(By.id("gf-BIG"));
	List<WebElement> ls1=footdriver.findElements(By.tagName("a"));
	int count1=ls1.size();
	System.out.println("no. of hyperlinks on footer are:"+count1);
	
	WebElement columndriver=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
	List<WebElement> ls2=columndriver.findElements(By.tagName("a"));
	int count2=ls2.size();
	System.out.println("no. of hyperlinks in column are:"+count2);
	
	for(int i=0;i<count2;i++){
		String opennewtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		System.out.println(opennewtab);
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(opennewtab);
		Thread.sleep(5000);
		/*if(i>5){
			System.out.println("out of list");
		}*/
	}
	Set<String> str=driver.getWindowHandles();
	Iterator<String> itr=str.iterator();
	while(itr.hasNext()){
		driver.switchTo().window(itr.next());
		String title=driver.getTitle();
		System.out.println("hyperlink title names of footer on website is"+title);
		
	}
	
}
}
