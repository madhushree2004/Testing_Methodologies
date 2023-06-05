package com.example.demo.day3_4;

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
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver= new EdgeDriver();
    	String url="https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";
    	driver.navigate().to(url);
        driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Madhushree");
        driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("727821tuee049@skct.edu.in");
        driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Madhushree");
        driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("727821tuee049@skct.edu.in");
        driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)"," ");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Happy Birthday");
        driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("300");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
        
    }
}
