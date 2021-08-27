package com.flipkart.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.FlipkartBase;

public class LaptopPage extends FlipkartBase{
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	WebElement Laptoplink;

	
	public LaptopPage()
	{
		PageFactory.initElements(driver, this);
	}
  public DellPage SelectLaptop() {
	  
	  Laptoplink.click();
	  String MainWindow=driver.getWindowHandle();						
      Set<String> s1=driver.getWindowHandles();		
      Iterator<String> i1=s1.iterator();		
      		
      while(i1.hasNext())			
      {		
          String ChildWindow=i1.next();		
          		
          if(!MainWindow.equalsIgnoreCase(ChildWindow))			
          {    		
               
                  
                  driver.switchTo().window(ChildWindow);	                                                                                                                 			
                
          }		
      }
	  
	  return new DellPage();
	  
  }
  
  public String verifyLaptopTitle() {
	  return driver.getTitle();
  }
}
