package com.flipkart.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.FlipkartBase;
import com.flipkart.qa.pages.BuyNowPage;
import com.flipkart.qa.pages.DellPage;
import com.flipkart.qa.pages.FlipHomePage;
import com.flipkart.qa.pages.LaptopPage;
import com.flipkart.qa.pages.LoginPageFlip;
import com.gargoylesoftware.htmlunit.WebConsole.Logger;

@Test
public class FlipBuyNowPageTest extends FlipkartBase {
	
	LoginPageFlip loginpageflip;
	FlipHomePage fliphomepage;
	LaptopPage laptoppage;
	DellPage dellpage;
	BuyNowPage buynowpage;
	
	
@BeforeMethod
public void setUpFlip() throws IOException, InterruptedException {
	
	    initialization();
		loginpageflip= new LoginPageFlip();	
		laptoppage=new LaptopPage();
		fliphomepage= loginpageflip.LoginProcess();
		laptoppage=fliphomepage.SearchProduct();
		dellpage=laptoppage.SelectLaptop();
		buynowpage=dellpage.Payment();
	}

public void CheckoutTest() throws InterruptedException {
	   
	   buynowpage.CheckOut();
}
@AfterMethod
public void browserClose(){
	
	driver.quit();
}


}
