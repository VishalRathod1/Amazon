package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Vishal");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rathod");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("vishurathod111@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("v@011194");
		//driver.findElement(By.xpath("//select[@id='day']")).click();
		WebElement driver1=driver.findElement(By.xpath("//select[@id='day']"));
		Select sel=new Select(driver1);
		sel.selectByIndex(1);
		
		WebElement driver2=driver.findElement(By.xpath("//select[@id='month']"));
		Select sel1=new Select(driver2);
		sel1.selectByVisibleText("Nov");
		
		WebElement driver3=driver.findElement(By.xpath("//select[@id='year']"));
		Select sel2=new Select(driver3);
		sel2.selectByValue("1994");
	
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@id='u_0_11']")).click();
		driver.navigate().back();
		//driver.switchTo().alert().accept();

	}

}
