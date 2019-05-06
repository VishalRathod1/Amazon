package amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\16122018\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String s=driver.getCurrentUrl();
		System.out.println("amazon page login url is" +s);
		
		String title=driver.getTitle();
		System.out.println("amazon page login title is" +title);
		
		List<WebElement> l=driver.findElements(By.tagName("a"));
		int count=l.size();
		System.out.println(count);
		
		WebElement obj1=driver.findElement(By.id("nav-your-amazon"));
		Actions action1=new Actions(driver);
		action1.doubleClick(obj1);
		action1.build().perform();
		System.out.println("amazon home");
		driver.navigate().back();
		
		WebElement obj2=driver.findElement(By.className("nav-a"));
		Actions action2=new Actions(driver);
		action2.contextClick(obj2);
		action2.build().perform();
		System.out.println("today's deals");
		driver.navigate().back();
		
		WebElement obj3=driver.findElement(By.xpath("//span[@class='nav-line-1'][.='Hello. Sign in']"));
		Actions action3=new Actions(driver);
		action3.moveToElement(obj3);
		action3.build().perform();
		
		driver.findElement(By.xpath("//span[@class='nav-text'][.='Your Orders']")).click();
		action3.build().perform();
		driver.navigate().back();
		

	}
}
