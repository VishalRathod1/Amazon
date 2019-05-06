package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	Set<Cookie> cookies=driver.manage().getCookies();
	for(Cookie c:cookies){
		System.out.println("The Name of Cookie is"+c.getName());
		System.out.println("The Expiry date of Cookie is"+c);
		System.out.println("The Value of Cookie is"+c);
		System.out.println("The Path of Cookie is"+c);
		System.out.println("The Domain of Cookie is"+c);
		System.out.println("Check Cookie is Secure"+c);
		System.out.println("Check httponly"+c);
		System.out.println("Check Class"+c);
	}
}
}
