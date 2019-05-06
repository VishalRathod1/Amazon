package com.echoecho.model;

import java.util.Iterator;
import java.util.List;

import org.omg.DynamicAny.NameDynAnyPair;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EchoechoDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//select alternately all radio buttons in section1
		System.out.println("Section1:");
		//select radio button on Milk
		WebElement milk=driver.findElement(By.xpath("//input[@value='Milk']"));
		milk.click();
		String milkText=milk.getAttribute("value");
		System.out.println(milkText);
		
		//select radio button on Cheese
		WebElement cheese=driver.findElement(By.xpath("//input[@value='Cheese']"));
		cheese.click();
		String cheeseText=cheese.getAttribute("value");
		System.out.println(cheeseText);
	    
		//select radio button on Butter
		WebElement butter=driver.findElement(By.xpath("//input[@value='Butter']"));
		butter.click();
		String butterText=butter.getAttribute("value");
		System.out.println(butterText);
		
		//select alternately all radio buttons in section2
		System.out.println("Section2:");
		//select radio button on Water
		WebElement water=driver.findElement(By.xpath("//input[@value='Water']"));
		water.click();
		String waterText=water.getAttribute("value");
		System.out.println(waterText);
		
		//select radio button on Beer
		WebElement beer=driver.findElement(By.xpath("//input[@value='Beer']"));
		beer.click();
		String beerText=beer.getAttribute("value");
		System.out.println(beerText);
		
		//select radio button on Wine
		WebElement wine=driver.findElement(By.xpath("//input[@value='Wine']"));
		wine.click();
		String wineText=wine.getAttribute("value");
		System.out.println(wineText);

		//iterate section1
		List<WebElement> ls1=driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println("Total radio buttons available in section1 are:"+ls1.size());
		for(int i=0;i<ls1.size();i++){
			System.out.println(ls1.get(i).getAttribute("value"));
		}
		
		
		//iterate section2
		List<WebElement> ls2=driver.findElements(By.xpath("//input[@name='group2']"));
		System.out.println("Total radio buttons available in section2 are:"+ls2.size());
		for(int j=0;j<ls2.size();j++){
			System.out.println(ls2.get(j).getAttribute("value"));
		}
		
		/*List<WebElement> ls3=driver.findElements(By.xpath("//input[@name='group1']"));
		Iterator itr=ls3.iterator();
		while(itr.hasNext()){
			WebElement vishu=(WebElement)itr.next();
			String vishal=vishu.getText();
			System.out.println(vishal);
		}*/
	}

}
