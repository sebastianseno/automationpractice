/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automationpractice.tests;

/**
 *
 * @author Sebastian Seno
 */
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleBanners {
    
    public static void main(String[] args) {
        
        //open browser
        System.setProperty("webdriver.chrome.driver", "D:\\selenium test lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        
        //test:
        driver.findElement(By.xpath(".//*[@id='htmlcontent_top']/ul/li[1]/a/img")).click();
        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='htmlcontent_top']/ul/li[2]/a/img")).click();
        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='htmlcontent_home']/ul/li[1]/a/img")).click();
        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='htmlcontent_home']/ul/li[2]/a/img")).click();
        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='htmlcontent_home']/ul/li[3]/a/img")).click();
        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='htmlcontent_home']/ul/li[4]/a/img")).click();
        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='htmlcontent_home']/ul/li[5]/a/img")).click();
        
        driver.quit();
        
      
}
    }

