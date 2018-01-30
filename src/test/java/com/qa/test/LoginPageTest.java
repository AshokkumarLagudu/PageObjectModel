package com.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends BaseClass{
	
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest() throws IOException{
		super();
	}
	
	@BeforeMethod
	public void setup(){
		
		initialization();
		loginpage=new LoginPage();
				
	}
	
	
	@Test(enabled=true,priority=1)
	public void testtitle(){
		String title=loginpage.gettilte();
	
		Assert.assertEquals("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More",title);
		System.out.println(title);
	}
	
	@Test(priority=2)
	public void logintest(){
		
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void quitBrowser(){
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
