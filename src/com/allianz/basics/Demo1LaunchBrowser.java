package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		String browser="edge";
		if(browser.equalsIgnoreCase("ch"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		
		//Webdriver driver=new EdgeDriver();
         WebDriver driver1= new ChromeDriver();
         driver.get("https://www.facebook.com");
         String driverTitle=driver.getTitle();
         System.out.println("driver title" +driverTitle );
         
         driver1.get("https://google.com");
         String actualTitle=driver1.getTitle();
         System.out.println("actual title driver1" +actualTitle);
         
         driver.quit();
	}

}
