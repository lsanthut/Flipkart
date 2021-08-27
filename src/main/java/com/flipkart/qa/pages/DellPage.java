package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.FlipkartBase;

public class DellPage extends FlipkartBase{

	
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	WebElement buynowbutton;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement addtocartbutton;
	
	
	public DellPage()
	{
		PageFactory.initElements(driver, this);
	}
	public BuyNowPage  Payment()
	{
	  buynowbutton.click();
	  return new BuyNowPage();
	}
 
	public boolean VerifyAddToCartButton() {
		return addtocartbutton.isDisplayed();
	}
}
