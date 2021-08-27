package com.flipkart.qa.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.flipkart.qa.base.FlipkartBase;

public class LoginPageFlip extends FlipkartBase{
	
	Logger log = Logger.getLogger(LoginPageFlip.class);
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement username;

	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement password;

	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement loginBtn;
   
	@FindBy(xpath="//img[@class='_2xm1JU']")
	WebElement loginlogo;
	
	public LoginPageFlip(){
		PageFactory.initElements(driver, this);
	}
	
	public FlipHomePage LoginProcess() throws IOException{
		username.sendKeys(map().get("Username"));
		password.sendKeys(map().get("Password"));
		loginBtn.click();
		log.info("login to the website");
		return new FlipHomePage();
	}
	
	public boolean ValidateLoginIcon() {
		
		return loginlogo.isDisplayed();
	}


}
