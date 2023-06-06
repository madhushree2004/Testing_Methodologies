package com.example.demo.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_5 {

	WebDriver driver;
	  @Test(priority=1)
	  public void verifyUrl()throws InterruptedException{
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.godaddy.com/");
		  driver.manage().window().maximize();
		  String actualTitle=driver.getTitle();
		  Assert.assertEquals(actualTitle,driver.getTitle());
		  Thread.sleep(3000);
		  String actualUrl=driver.getCurrentUrl();
		  Assert.assertEquals(actualUrl,driver.getCurrentUrl());
		  driver.quit();
		  
		  
		  
	  }
	  @Test
	  public void Act() {
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.godaddy.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement domain=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button"));
		  domain.click();
		  WebElement domainname=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span"));
		  domainname.click();
		  driver.quit();
		  
	  }
}
