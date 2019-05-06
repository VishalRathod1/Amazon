package com.screenshot.model;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenshotDemo {
public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

/*driver.get("https://www.google.com/");
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("E:\\Selenium\\Screenshot_Selenium\\google.jpeg"));*/

/*driver.get("https://www.google.com/search?biw=1366&bih=657&tbm=isch&sa=1&ei=kH2WXJ63Ndi2rQHpp5LoAg&q=thor+endgame&oq=thor&gs_l=img.1.3.0i67l7j0j0i67l2.1822.4785..8064...0.0..2.343.2081.0j3j4j2......0....1..gws-wiz-img.....0.QvBNAQ-NemU#imgdii=2-rJuUJMI2ByfM:&imgrc=uIBJDTDhVZuV9M:");
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("E:\\Selenium\\Screenshot_Selenium\\Thor_CaptainMarvel.jpeg"));*/

driver.get("https://www.google.com/search?biw=1366&bih=657&tbm=isch&sa=1&ei=136WXIPBBYuf9QOI7r2wBA&q=game+of+thrones+season+8&oq=game+&gs_l=img.1.4.0i67l3j0l2j0i67l2j0j0i67l2.61802.65622..68865...0.0..0.163.1022.0j8......0....1..gws-wiz-img.....0.M_f2GKrrta4#imgrc=c2W8AviwqS-f-M:");
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("E:\\Selenium\\Screenshot_Selenium\\Game_Of_Thrones.jpeg"));
System.out.println("The Screenshot of Game Of Thrones image is taken successfully");

/*driver.findElement(By.cssSelector("input[name='q']")).sendKeys("avengers endgame");
driver.findElement(By.xpath("//input[@value='Google Search']")).click();
WebElement obj=driver.findElement(By.xpath("//div[@class='sbl1']/span"));
Actions action=new Actions(driver);
action.moveToElement(obj).build().perform();
Thread.sleep(5000);*/



}
}
