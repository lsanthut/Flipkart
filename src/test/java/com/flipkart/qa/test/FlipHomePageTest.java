package com.flipkart.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.FlipkartBase;
import com.flipkart.qa.pages.FlipHomePage;
import com.flipkart.qa.pages.LaptopPage;
import com.flipkart.qa.pages.LoginPageFlip;

import junit.framework.Assert;

public class FlipHomePageTest extends FlipkartBase{
	
	LoginPageFlip loginpageflip;
	FlipHomePage fliphomepage;
	LaptopPage laptoppage;
	
@BeforeMethod
	public void setUpFlip() throws IOException {
		initialization();
		
		loginpageflip= new LoginPageFlip();	
		fliphomepage= loginpageflip.LoginProcess();
	}
@Test(priority=1)
public void VerifyMyAccountTest() {
	   
	   boolean flag=fliphomepage.VerifyMyAccount();
	   Assert.assertTrue(flag);
}

@Test(priority=2)
public void SearchProductTest() throws InterruptedException, IOException {
	   
	   laptoppage=fliphomepage.SearchProduct();
}





}
