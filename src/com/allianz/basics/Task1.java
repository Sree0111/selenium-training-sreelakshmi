package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
        driver.findElement(By.name("UserFirstName")).sendKeys("John");
        driver.findElement(By.name("UserLastName")).sendKeys("Wick");
        driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
        
        Select job=new Select(driver.findElement(By.name("UserTitle")));
        job.selectByVisibleText("IT Manager");
     //   driver.findElement(By.name("UserTitle")).sendKeys("IT_Manager_AP");
        driver.findElement(By.name("CompanyEmployees")).sendKeys("201 - 500 employees");
        
        Select country=new Select(driver.findElement(By.name("CompanyCountry")));
        country.selectByVisibleText("United Kingdom");
      //  driver.findElement(By.name("CompanyCountry")).sendKeys("United Kingdom");
        driver.findElement(By.name("CompanyName")).sendKeys("MyCompany");
      //  Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='msaCheckbox checkboxInput section']//div[@class='checkbox-ui']")).click();
        
        driver.findElement(By.name("start my free trial")).click();
        String error=driver.findElement(By.xpath("//span[text()=\"Enter a valid phone number\"]")).getText();
        System.out.println("Error msg::::"+error);
	}

}
