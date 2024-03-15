package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.medibuddy.in/");
        Thread.sleep(4000);
        //Alert alert=driver.switchTo().alert();
       // alert.dismiss();
        driver.switchTo().frame("wiz-iframe");
        driver.findElement(By.xpath("//a[@class=\"wzrkClose\"]")).click();
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class=\"coperate\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("//a[text()=\"Learn More\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"skip\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Login using Username & Password\"]")).click();
        driver.findElement(By.id("username")).sendKeys("John");
        driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("john123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[contains(@class,'show-password')]")).click();
        driver.findElement(By.xpath("//button[text()=\"Sign In\"]")).click();
        String error=driver.findElement(By.xpath("//div[contains(@class,'alert alert')]")).getText();
        		//driver.findElement(By.xpath("//div[@class=\"dropDownIcon dropDownCardType oneField account-type\"]")).click();
      System.out.println("Error msg" +error);
      //indElement(By.xpath("//select/option[3][text()=\"Credit Card\"]")).click();
        
	}

}
