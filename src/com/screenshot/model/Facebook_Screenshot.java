package com.screenshot.model;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.seleniumhq.jetty9.server.handler.ContextHandler.StaticContext;

public class Facebook_Screenshot {
	public WebDriver driver;

	public void captureScreenshot(String filename, String extension) throws IOException {
		File src = ((TakesScreenshot)Config.driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src, new
		// File("E:\\Selenium\\Screenshot_Selenium\\Fb Login Page.jpeg"));
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		FileUtils.copyFile(src, new File("E:\\Selenium\\Screenshot_Selenium\\" + filename + timeStamp + extension));
	}
}
