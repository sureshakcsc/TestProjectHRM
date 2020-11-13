package com.dxc.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	//public WebDriverWait wait;
   public  static WebDriver driver;
	public  static  Properties prop; 
	
	 public TestBase()
	 {
	 try
	 {
	//Property File
	
	 prop= new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Suresh AK\\Desktop\\Softwares\\Selenium Installations\\samplejava\\HRMFramework\\config.properties");
	
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	} catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	 
	 public static void intilization()
	 {
		
    String browsername=prop.getProperty("browser");
    //String url= prop.getProperty("URL");
    if(browsername.equalsIgnoreCase("chrome"))
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Suresh AK\\Desktop\\ALL DATA FOLDER\\Softwares\\Selenium Installations\\Softwares\\drivers\\chromedriver.exe");
    	 driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    	driver.get(prop.getProperty("url"));
    //	driver.get("https://sureshorangehrm-trials65141.orangehrmlive.com");
    	//General Clic method
    } 	
	 }
}
