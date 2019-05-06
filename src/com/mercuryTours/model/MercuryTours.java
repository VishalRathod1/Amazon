package com.mercuryTours.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		System.out.println("Please fill the Contact Information below");
		System.out.println("Please enter your firstname");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Vishal");
		//String firstName=
		
		System.out.println("Please enter your lastname");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Rathod");
		
		System.out.println("Please enter your contact number");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8657070864");
		
		System.out.println("Please enter your Email ID");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("vishurathod111@gmail.com");
		
		System.out.println("Please fill the Mailing Information below");
		System.out.println("Please enter your Address");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("34,Rohini nagar 3,Jule Solapur,Solapur");
		
		System.out.println("Please enter your City");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Solapur");
		
		System.out.println("Please enter your State");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Maharashtra");
		
		System.out.println("Please enter your Postal Code number");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("413004");
		
		System.out.println("Please enter your Country");
		WebElement obj=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(obj);
		sel.selectByVisibleText("INDIA");
		
		System.out.println("Please fill the User Information below");
		System.out.println("Please enter your Username");
		driver.findElement(By.cssSelector("input#email")).sendKeys("vishur123");
		
		System.out.println("Please enter your Password");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@123");
		
		System.out.println("Please confirm your Password");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("");
		
		System.out.println("Please click on Submit button");
		driver.findElement(By.cssSelector("input[name='register']")).click();
		System.out.println("Dear,Thank you for registering.You may now sign-in using the user name and password you've just entered");
		
		WebElement signin=driver.findElement(By.partialLinkText("Sig"));
		Actions action=new Actions(driver);
		action.moveToElement(signin).build().perform();
		Thread.sleep(5000);
		

	}

}
