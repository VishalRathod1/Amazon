package echoecho;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Echoecho {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.echoecho.com/htmlforms10.htm");
	driver.manage().window().maximize();
	
	/*WebElement obj1=driver.findElement(By.xpath("//input[@value='Milk']"));
	String text1=obj1.getText();
	System.out.println(text1);*/
	
	List<WebElement> ls1=driver.findElements(By.xpath("//input[@name='group1']"));
	//System.out.println(ls1.size());
	System.out.println("Group 1:");
	for(int i=0;i<ls1.size();i++){
		System.out.println(ls1.get(i).getAttribute("value"));
	}
	List<WebElement> ls2=driver.findElements(By.xpath("//input[@name='group2']"));
	//System.out.println(ls2.size());
	System.out.println("Group 2:");
	for(int i=0;i<ls2.size();i++){
		System.out.println(ls2.get(i).getAttribute("value"));
	}
	
	/*List<WebElement> ls=driver.findElements(By.xpath("//input[@name='group1']"));
	System.out.println(ls);
	Iterator itr=ls.iterator();
	while(itr.hasNext()){
		WebElement w=(WebElement) itr.next();
		
		String s=w.getText();
		System.out.println(s);
	}*/
	
}
}
