package com.flipkart.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.FlipkartBase;


public class FlipHomePage extends FlipkartBase {
	
	@FindBy(xpath="//input[@class='_3704LK']")
	WebElement searchbar;

	@FindBy(xpath="//button[@type='submit']")
	WebElement searchbutton;

	@FindBy(xpath="//div[@class='exehdJ']")
	WebElement loginBtn;
   
	@FindBy(xpath="//img[@class='_2xm1JU']")
	WebElement myaccount;
	
	public FlipHomePage (){
		
		PageFactory.initElements(driver, this);
	}
	
   public boolean VerifyMyAccount() {
	   
	   return myaccount.isDisplayed();
   }
   
   public LaptopPage SearchProduct() throws InterruptedException, IOException{
	   Thread.sleep(3000);
	   searchbar.sendKeys(map().get("Product"));
	   searchbutton.click();
	   return new LaptopPage();
   }
}
