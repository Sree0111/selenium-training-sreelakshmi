package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
       
        driver.findElement(By.id("email")).sendKeys("sree@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123");
        driver.findElement(By.name("login")).click();
        driver.quit();
	}

}
