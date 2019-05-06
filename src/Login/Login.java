package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\16122018\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("E:\\Selenium\\LOGIN.html");
    driver.manage().window().maximize();
    driver.findElement(By.id("uid")).sendKeys("vishal");
    driver.findElement(By.name("password")).sendKeys("vishu123");
    driver.findElement(By.className("usernm")).click();
    driver.switchTo().alert().accept();
}
}
