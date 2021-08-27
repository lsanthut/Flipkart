package com.flipkart.qa.test;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.flipkart.qa.base.FlipkartBase;
import com.flipkart.qa.pages.BuyNowPage;
import com.flipkart.qa.pages.DellPage;
import com.flipkart.qa.pages.FlipHomePage;
import com.flipkart.qa.pages.LaptopPage;
import com.flipkart.qa.pages.LoginPageFlip;
import junit.framework.Assert;

public class FlipDellPageTest extends FlipkartBase{
	
	
	LoginPageFlip loginpageflip;
	FlipHomePage fliphomepage;
	LaptopPage laptoppage;
	DellPage dellpage;

@BeforeMethod
public void setUpFlip() throws IOException, InterruptedException {
	
	    initialization();
		loginpageflip= new LoginPageFlip();	
		laptoppage=new LaptopPage();
		fliphomepage= loginpageflip.LoginProcess();
		laptoppage=fliphomepage.SearchProduct();
		dellpage=laptoppage.SelectLaptop();
	}
@Test(priority=1)
public void VerifyAddToCartButtonTest() {
	   
	  boolean flag=dellpage.VerifyAddToCartButton();
	  Assert.assertTrue(flag);
}
@Test(priority=2)
public void SearchProductTest() {
	   
	   dellpage.Payment();
}
@AfterMethod
public void browserClose(){
	driver.quit();
}

}
