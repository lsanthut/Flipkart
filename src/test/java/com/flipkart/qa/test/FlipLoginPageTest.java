package com.flipkart.qa.test;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.FlipkartBase;
import com.flipkart.qa.pages.FlipHomePage;
import com.flipkart.qa.pages.LoginPageFlip;

import junit.framework.Assert;

public class FlipLoginPageTest extends FlipkartBase{
	
	
	LoginPageFlip loginpageflip;
	FlipHomePage fliphomepage;
	
@BeforeMethod
	public void setUpFlip() throws IOException {
		initialization();
		
		loginpageflip= new LoginPageFlip();	
		fliphomepage= new FlipHomePage();
	}
@Test(priority=1)
public void validateLoginTest() {
	boolean flag=loginpageflip.ValidateLoginIcon();
	Assert.assertTrue(flag);
}
@Test(priority=2)
public void loginTest() throws IOException{
	fliphomepage = loginpageflip.LoginProcess();
}

@AfterMethod
public void browserClose(){
	driver.quit();
}
}
