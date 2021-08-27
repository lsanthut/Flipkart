package com.flipkart.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.qa.test.FlipBuyNowPageTest;
import com.gargoylesoftware.htmlunit.WebConsole.Logger;



public class FlipkartBase {

	public static WebDriver driver;
	public static Properties prop;
     
	public FlipkartBase()
	{
		
	}	
	public static void initialization() throws IOException{
		
		Properties prop = new Properties();	
		FileInputStream objfile = new FileInputStream("C:\\Users\\SANTHOSH\\eclipse-workspace\\flipkart\\src\\main\\java\\com\\flipkart\\qa\\configure\\configure.properties");									
	    prop.load(objfile);
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHOSH\\Downloads\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url"));
	}
	
	public Map<String,String> map() throws IOException {
		File file = new File("C:\\Users\\SANTHOSH\\eclipse-workspace\\flipkart\\FlipkartTestdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int lastcellnum =sheet.getRow(0).getLastCellNum();
		Map<String,String> datamap = new HashMap<String,String>();
		for(int i=0;i<lastcellnum;i++)
		{
			String key = sheet.getRow(0).getCell(i).getStringCellValue();
			String Value = sheet.getRow(1).getCell(i).getStringCellValue();
			datamap.put(key, Value);
		}
		return datamap;
		
	}
	}

