package com.cookies.model;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\16122018\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//capture all the cookies from the browser
		Set<Cookie> cookies=driver.manage().getCookies();
		int cookieSize=cookies.size();
		System.out.println("The size of cookie is:"+cookieSize);
		
		//read and print all the cookies
		for(Cookie cookie:cookies){
			System.out.println("The name of cookie is:"+cookie.getName());
			System.out.println("The expiry date of cookie is:"+cookie.getExpiry());
			System.out.println("The value of cookie is:"+cookie.getValue());
			System.out.println("The path of cookie is:"+cookie.getPath());
			System.out.println("The class of cookie is:"+cookie.getClass());
			System.out.println("The domain name of cookie is:"+cookie.getDomain());
			System.out.println("Verify the cookie is secure:"+cookie.isSecure());
			System.out.println("Verify the cookie is HttpOnly:"+cookie.isHttpOnly());
		}
		
		//driver.manage().deleteCookieNamed("S");
		//System.out.println("The cookie named 'S' deleted successfully");

		Cookie cookienm=driver.manage().getCookieNamed("SN");
		System.out.println(cookienm.getName());
		
		Cookie cookienew=new Cookie("username", "vishal");
		driver.manage().addCookie(cookienew);
		
		Set<Cookie> cookies1=driver.manage().getCookies();
		int cookieSize1=cookies1.size();
		System.out.println("The size of cookie is:"+cookieSize1);
		
		
		
	}

}
