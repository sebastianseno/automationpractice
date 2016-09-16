/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automationpractice.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author Sebastian Seno
 */
public class SortBy {
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "D:\\selenium test lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
    
        //this codes is for automated test "sort product" in page "DRESSES" 
        driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();
        driver.findElement(By.xpath(".//*[@id='selectProductSort']")).sendKeys("price:asc");
        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();
        driver.findElement(By.xpath(".//*[@id='selectProductSort']")).sendKeys("price:desc");
        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();
        driver.findElement(By.xpath(".//*[@id='selectProductSort']")).sendKeys("name:asc");
        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();
        driver.findElement(By.xpath(".//*[@id='selectProductSort']")).sendKeys("name:desc");
        driver.quit();
    }
    
}
