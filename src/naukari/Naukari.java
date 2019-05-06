package naukari;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	
   /* Set<String> s=driver.getWindowHandles();
    Iterator<String> itr=s.iterator();
     while(itr.hasNext())
    {
    	driver.switchTo().window(itr.next());
    	String title=driver.getTitle();
    	System.out.println(title);
    	driver.close();
    }*/
    
	Set<String> s=driver.getWindowHandles();
	String parent=driver.getWindowHandle();
	
    Iterator<String> itr=s.iterator();
    while(itr.hasNext()){
    	String child=itr.next();
    	if(!parent.equals(child)){
    		driver.switchTo().window(child);
    		String title=driver.getTitle();
        	System.out.println(title);
        	driver.close();
    	}
    }
    
}
}
