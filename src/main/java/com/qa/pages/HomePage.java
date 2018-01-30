package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//span[starts-with(text(),'Electronics')]")
	WebElement Electronics;
	
	@FindBy(xpath="//ul[@class='QPOmNK']/li[2]/a/span")
	WebElement Samsung;
	
	@FindBy(xpath="//a[@class='_1AHrFc _2k0gmP']")
	WebElement AccountName;
	
	@FindBy(xpath="//div[@class='zi6sUf']/div/ul/li[2]")
	WebElement Appliances;
	
	@FindBy(linkText="Men's Footwear")
	WebElement Footwear;
     public HomePage(){
		
		PageFactory.initElements(driver, this);
	}
	
public void ElectronicsPage(){
	
	Actions act=new Actions(driver);
	act.moveToElement(Electronics).click(Samsung).build().perform();
	
	//act.contextClick();
	//Samsung.click();
	
}

public void SamsungPage(){
	Actions act=new Actions(driver);
	act.moveToElement(Samsung).perform();
	act.contextClick();
}

public boolean verifyName(){
	
	return AccountName.isDisplayed();
	
}

public String HomePageTitle(){
	
	return driver.getTitle();
}

public void MenFootwear(){
	Footwear.click();
}

}
