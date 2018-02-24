package com.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import junit.framework.Assert;
//PageObjectModel
public class HomePageTest extends BaseClass {
	
	LoginPage loginpage;
	HomePage homepage;
	
	public HomePageTest() throws IOException{
		super();
	}
	
	@BeforeMethod
	public void setup(){
		
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));	
	}
	
	@Test(priority=1,enabled=false)
	public void verifyHomePageTitle(){
		
	String homepageTitle= homepage.HomePageTitle();
	Assert.assertEquals("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More",homepageTitle);
		
	}
	@Test(priority=2,enabled=false)
	public void Electronics(){
		
		//homepage.ElectronicsPage();
		Assert.assertTrue(homepage.verifyName());
	}
	@Test(priority=3,enabled=false)
	public void MenFootweartest() 
	{
		homepage.MenFootwear();
		
		
	}
	@Test(priority=4)
	public void ElectronicsPagetest() throws InterruptedException{
		homepage.ElectronicsPage();
		Thread.sleep(5000);
	}
	
	@Test(priority=5,enabled=false)
	public void SamsungPageTest() throws InterruptedException{
		
		homepage.SamsungPage();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
