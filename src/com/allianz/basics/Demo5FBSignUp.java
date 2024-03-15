package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.facebook.com/");
      
       // driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("jack");
        driver.findElement(By.name("lastname")).sendKeys("wick");
        driver.findElement(By.id("password_step_input")).sendKeys("test123");
        Select daySelect=new Select(driver.findElement(By.id("day")));
        daySelect.selectByVisibleText("14");
        
        Select monthSelect=new Select(driver.findElement(By.id("month")));
        monthSelect.selectByVisibleText("May");
        
        Select monthYear=new Select(driver.findElement(By.id("year")));
        monthYear.selectByVisibleText("2020");
        
	}

}
