package com.example.demo.testing;

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
        WebDriver driver = new EdgeDriver();
        //launching the Url
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        //maximize the webpage
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Madhushree");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Kanagaraj");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727821tuee049@skct.edu.in");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)"," ");
    }
}
