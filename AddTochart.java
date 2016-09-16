/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automationpractice.tests;


import java.util.Set;
import javax.swing.text.html.HTMLDocument;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Sebastian Seno
 */
public class AddTochart {
    

        public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium test lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        
        driver.findElement(By.xpath(".//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span")).click();
        driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
           
        if(driver.switchTo().alert() != null)
    {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.dismiss(); // alert.accept();
        

}
     
        }
}