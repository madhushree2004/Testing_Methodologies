package com.example.demo.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_3 {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement value=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		value.sendKeys("401");
		Thread.sleep(2000);
		WebElement click=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		click.click();
		Thread.sleep(2000);
		Alert obj=driver.switchTo().alert();
		obj.dismiss();
		value.clear();
		Thread.sleep(2000);
		value.sendKeys("402");
		click.click();
		Thread.sleep(2000);
		obj.accept();
		Alert ob=driver.switchTo().alert();
		String text=ob.getText();
		ob.accept();
		System.out.print(text);
		Thread.sleep(2000);
		driver.quit();	
	}

}
