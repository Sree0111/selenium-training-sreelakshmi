package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
      
        //driver.findElement(By.xpath("//div[@class=\"dropDownIcon dropDownCardType oneField account-type\"]")).click();
       driver.findElement(By.xpath("//div[@class=\"sbHolder\"]/a[2]")).click();
        driver.findElement(By.linkText("Credit Card")).click();
     
   
    
        
     //   driver.findElement(By.xpath("//div[@class=\"sbHolder\"]/a[2]")).sendKeys("Credit Card");
       String val=driver.findElement(By.xpath("//div[@class=\"sbHolder\"]/a[2]")).getText();
    		  System.out.println(val);
    		  
    driver.findElement(By.id("citiCard1")).sendKeys("4545");
    driver.findElement(By.id("citiCard2")).sendKeys("5656");
    driver.findElement(By.id("citiCard3")).sendKeys("6667");
    driver.findElement(By.id("citiCard4")).sendKeys("5565");
    driver.findElement(By.name("CCVNO")).sendKeys("123");
    driver.findElement(By.name("DOB")).click();
  //  Thread.sleep(1000);
    
    Select year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
    year.selectByVisibleText("2022");
   // driver.findElement(By.className("ui-datepicker-year")).sendKeys("2022");
    //driver.findElement(By.className("ui-datepicker-year")).sendKeys(Keys.DOWN);
    //driver.findElement(By.className("ui-datepicker-year")).sendKeys(Keys.ENTER);

    Select monthIn=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
    monthIn.selectByVisibleText("Apr");
    
   
   // Select dateinCalendar=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
    //dateinCalendar.selectByVisibleText("14");
    //driver.findElement(By.className("ui-datepicker-month")).sendKeys("Apr");
    

    
    //driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]//option[text()=\"2022\"]")).click();
    
    driver.findElement(By.xpath("//a[text()=\"14\"]")).click();
   driver.findElement(By.xpath("//input[@value=\"PROCEED\"]")).click();
    String error=driver.findElement(By.xpath("//div[@id=\"ui-id-1\"]/li")).getText();
    System.out.println("error message" + error);
     //   driver.quit();
       // driver.findElement(By.xpath("//div[@class=\"sbHolder\"]/a[2]")).sendKeys("Credit Card");
    //    driver.findElement(By.xpath("//select/option[3][text()=\"Credit Card\"]")).click();
        
	}

}
