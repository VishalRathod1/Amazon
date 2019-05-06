package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_by_css {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("input#u_0_j")).sendKeys("Reshu");
	driver.findElement(By.cssSelector("input#u_0_l")).sendKeys("Rathod");
	driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("reshmarathod@gmail.com");
	driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("r@140386");
	
	WebElement driver1=driver.findElement(By.cssSelector("select._5dba[id='day']"));
	Select sel=new Select(driver1);
	sel.selectByIndex(14);
	
	WebElement driver2=driver.findElement(By.cssSelector("select._5dba[id='month']"));
	Select sel1=new Select(driver2);
	sel1.selectByVisibleText("Mar");
	
	WebElement driver3=driver.findElement(By.cssSelector("select._5dba[title='Year']"));
	Select sel2=new Select(driver3);
	sel2.selectByValue("1986");
	
	driver.findElement(By.cssSelector("label._58mt")).click();
	driver.findElement(By.cssSelector("button[name='websubmit']")).click();
	driver.navigate().back();
}
}
