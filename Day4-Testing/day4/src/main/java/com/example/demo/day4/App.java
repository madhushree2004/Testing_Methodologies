package com.example.demo.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     	WebDriverManager.edgedriver().setup();
    	WebDriver driver= new EdgeDriver();
    	String url="https://demo.opencart.com/";
    	driver.navigate().to(url);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,2000)", "");
    	driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
    }
}
