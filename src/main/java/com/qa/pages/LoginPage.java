package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//li[@class='_2sYLhZ' ]/a[text()='Log In']")
	WebElement logbtn;
	
	@FindBy(xpath="//div[@class='_39M2dM']/input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//div[@class='_39M2dM']/input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginBtn;
	
	
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
public HomePage login(String un,String pwd){
	//logbtn.click();
	username.sendKeys(un); 
	password.sendKeys(pwd);
	loginBtn.click();
	
	return new HomePage();
}

public String gettilte()
{
	return driver.getTitle();
}

	
	
	
	
	
	
	
	
	
}
