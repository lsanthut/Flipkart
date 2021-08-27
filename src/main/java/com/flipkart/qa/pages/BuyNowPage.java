package com.flipkart.qa.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.FlipkartBase;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class BuyNowPage extends FlipkartBase{
	
	Logger log = Logger.getLogger(BuyNowPage.class);
	
	
	@FindBy(xpath="//button[@class='_2KpZ6l _1seccl _3AWRsL']")
	WebElement continuebutton;
	
	@FindBy(xpath="//label[@for='CREDIT']")
	WebElement choosecard;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement cardnumber;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2nejCf _3AWRsL']")
	WebElement paynowbutton;
	
	@FindBy(xpath="//div[@class='_1XFPmK']")
	WebElement cardbutton;
	
	
	public BuyNowPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void CheckOut() throws InterruptedException {
	
		continuebutton.click();
		log.info("clicking continue button");
	
		Thread.sleep(1000);
		 cardbutton.click();
		 //choosecard.click();
		log.info("choosing card");
		cardnumber.sendKeys("987654");
		paynowbutton.click();
		log.info("clicking paynow button");
	}
}
