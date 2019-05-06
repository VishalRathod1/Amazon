package Ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ksrtc {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://ksrtc.in/oprs-web/");
	driver.manage().window().maximize();
	
	WebElement leavingfrom=driver.findElement(By.id("fromPlaceName"));
	leavingfrom.sendKeys("BENG");
	//Thread.sleep(5000);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String script="return document.getElementById(\"fromPlaceName\").value;";
	String text=(String)js.executeScript(script);
	System.out.println(text);
	int i=0;
	while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")){
		i++;
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		String text1=(String)js.executeScript(script);
		System.out.println(text1);
		if(i>5){
			break;
		}
	}
	if(i>5){
		System.out.println("element is not found");
	}
	else{
		System.out.println("element is found");
	}
	
}
}
