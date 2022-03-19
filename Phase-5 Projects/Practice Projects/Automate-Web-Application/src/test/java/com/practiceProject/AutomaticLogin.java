package com.practiceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomaticLogin 
{
	
public static void main(String [] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://www.wikipedia.org/");
    
    driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
    
    driver.findElement(By.xpath("//*[@id=\"pt-createaccount\"]/a/span")).click();
    
    driver.findElement(By.id("wpName2")).sendKeys("HemanthrayanA");
    
    driver.findElement(By.id("wpPassword2")).sendKeys("Hemanthrayan@123");
    
    driver.findElement(By.id("wpRetype")).sendKeys("Hemanthrayan@123");
    
    Thread.sleep(40000);
        
    driver.findElement(By.id("wpCreateaccount")).click();
    
    driver.findElement(By.xpath("//*[@id=\"pt-logout\"]/a/span")).click();
    
    Thread.sleep(5000);
        
    driver.findElement(By.xpath("//*[@id=\"pt-login\"]/a/span")).click();
    
    driver.findElement(By.id("wpName1")).sendKeys("HemanthrayanA");
        
    driver.findElement(By.id("wpPassword1")).sendKeys("Hemanthrayan@123");
    
    driver.findElement(By.id("wpLoginAttempt")).click();

}

	
}