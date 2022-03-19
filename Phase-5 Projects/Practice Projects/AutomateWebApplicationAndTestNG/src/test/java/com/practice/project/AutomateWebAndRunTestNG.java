package com.practice.project;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomateWebAndRunTestNG 
{
	public WebDriver driver;
	
	
	@Test
    public void Amazon() throws InterruptedException
    {
		System.out.println("Enter Your Option 1 or 2");
		System.out.println("1.Register New User");
		System.out.println("2.Login As Existing User");
		System.out.println("Enter Your Choice");
		Scanner sc = new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
		driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://www.amazon.in");
        
        driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Hemanth Rayan");

        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("hemanthrayan@gmail.com");
        
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Hemanth@1");
        driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("Hemanth@1 ");

        driver.findElement(By.id("continue")).click();
        
        Thread.sleep(60000);
        
        break;
		case 2:
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.amazon.in");
	        driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
	        
	        driver.findElement(By.id("ap_email")).sendKeys("hemanthrayn@gmail.com");

	        driver.findElement(By.id("continue")).click();
	        
	        driver.findElement(By.id("ap_password")).sendKeys("Hemanth@1");
	        
	        driver.findElement(By.id("signInSubmit")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("TV");
	        
	        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	        
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	        
		    break;
		default:
			System.out.println("Please Enter Valid Option");

    }
    }

}
