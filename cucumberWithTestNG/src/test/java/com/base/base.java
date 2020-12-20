package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static WebDriver driver;
	
	public static Properties prop;
	
	
	
	public base() {
		

		try {
			FileInputStream file = new FileInputStream("F:\\Practice\\EbayTest\\src\\main\\java\\com\\config\\Ebay.properties");
			prop = new Properties();
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			 
		
	}
		
	
	public static void initialization() {
		
	String Browser=	prop.getProperty("browser");
		
	if (Browser.equals("chrome")) {
		
		
		System.setProperty ("webdriver.chrome.driver","F:\\selenium_update_12-10-2019\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
		
	
	driver.get(prop.getProperty("url"));
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	
}

