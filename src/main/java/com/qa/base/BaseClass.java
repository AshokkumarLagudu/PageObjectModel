package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.rmi.CORBA.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.UtilClass;

public class BaseClass {
	
public static WebDriver driver;
public static Properties prop;
	public BaseClass()  {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("\\Selenium_Neon\\MaveneDemoTest\\src\\main\\java\\com\\"
					+ "qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
				
	}

	public static void initialization(){
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumPract\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browsername.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver","E:\\SeleniumPract\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(UtilClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtilClass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
}
