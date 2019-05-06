package flipkart;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement obj1=driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		Actions action1=new Actions(driver);
		action1.moveToElement(obj1);
		action1.build().perform();
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Mi")).click();
		driver.findElement(By.xpath("//ul[@class='QPOmNK']/li[2]/a")).click();
		Thread.sleep(5000);

		
		List<WebElement> ls=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		//Thread.sleep(5000);
		System.out.println(ls);
		Iterator itr=ls.iterator();
		while(itr.hasNext()){
			WebElement s=(WebElement) itr.next();
			
			String w=s.getText();
			System.out.println(w);
	}
	}
}
