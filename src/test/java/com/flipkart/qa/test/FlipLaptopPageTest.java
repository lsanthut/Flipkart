package com.flipkart.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.FlipkartBase;
import com.flipkart.qa.pages.DellPage;
import com.flipkart.qa.pages.FlipHomePage;
import com.flipkart.qa.pages.LaptopPage;
import com.flipkart.qa.pages.LoginPageFlip;

import junit.framework.Assert;

public class FlipLaptopPageTest extends FlipkartBase{
	
	
	LoginPageFlip loginpageflip;
	FlipHomePage fliphomepage;
	LaptopPage laptoppage;
	DellPage dellpage;
	
@BeforeMethod
	public void setUpFlip() throws IOException, InterruptedException {
		initialization();
		
		loginpageflip= new LoginPageFlip();	
		dellpage=new DellPage();
		fliphomepage= loginpageflip.LoginProcess();
		laptoppage=fliphomepage.SearchProduct();
	}

@Test(priority=1)
public void VerifyMyAccountTest() {
	   
	  String LaptopPageTitle=laptoppage.verifyLaptopTitle();
	  String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
      Assert.assertEquals(LaptopPageTitle, expectedTitle);
}
@Test(priority=2)
public void SearchProductTest() throws InterruptedException {
	   
	   dellpage=laptoppage.SelectLaptop();
}
@AfterMethod
public void browserClose(){
	driver.quit();
}

}
