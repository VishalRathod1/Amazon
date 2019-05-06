package newlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("E:/Selenium/Login1.html");
	driver.manage().window().maximize();
	String url=driver.getCurrentUrl();
	System.out.println(url);
	WebElement username=driver.findElement(By.id("uid"));
	username.sendKeys("vishal");
	WebElement password=driver.findElement(By.name("Password"));
	password.sendKeys("vishal123");
	WebElement browser=driver.findElement(By.xpath("//select[@id='browser']"));
    Select sel=new Select(browser);
    sel.selectByValue("ie");
    
}
}
