package com.allianz.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://nasscom.in/");
        Thread.sleep(4000);
        //Alert alert=driver.switchTo().alert();
       // alert.dismiss();
       
        driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
        
      //  driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[text()=\"register\"]")).click();
        driver.findElement(By.xpath("//div[@id='edit-field-fname-reg-wrapper']//following::div[1]/input[1]")).sendKeys("sree");
        driver.findElement(By.xpath("//input[@id='edit-field-lname-0-value']")).sendKeys("ss");
        driver.findElement(By.id("edit-mail")).sendKeys("abc@xyz.com");
        driver.findElement(By.xpath("//input[@id='edit-field-company-name-registration-0-value']")).sendKeys("xxx");
        driver.findElement(By.xpath("//select[@id='edit-field-business-focus-reg']/option[2]")).click();
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        
       // String error=driver.findElement(By.xpath("//li[text()='The answer you entered for the CAPTCHA was not correct.']")).getText();
//	System.out.println(error);
	}
}
