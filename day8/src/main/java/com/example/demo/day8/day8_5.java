package com.example.demo.day8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_5 {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search1=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search1.sendKeys("Apple");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String Title=driver.getTitle();
		Set<String> tabs=driver.getWindowHandles();
		System.out.println(Title);
		System.err.print(tabs);
		
		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/");
		WebElement search2=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search2.sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String Title1=driver.getTitle();
		Set<String> tabs1=driver.getWindowHandles();
		System.out.println(Title1);
		System.err.print(tabs1);
		
		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/");
		WebElement search3=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search3.sendKeys("Cucumber");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String Title2=driver.getTitle();
		Set<String> tabs2=driver.getWindowHandles();
		System.out.println(Title2);
		System.err.print(tabs2);
		
		
		Set<String>total=driver.getWindowHandles();
		System.out.print("Total tabs "+total.size());
		Thread.sleep(2000);
		driver.quit();	
		
	}

}
