package com.example.demo.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_4 {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("chennai");
		driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("bangalore");
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).sendKeys("04-07-2023");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
