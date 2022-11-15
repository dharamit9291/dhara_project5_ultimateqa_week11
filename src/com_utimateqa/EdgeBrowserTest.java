package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Maximise Window
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("page title is :" + title);

        // Get current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Get page source
        System.out.println("Page source : " + driver.getPageSource());
        //Find the email field element and send the email
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("abc123@gmail.com");

        //Find the password field element and send the email
        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        passwordfield.sendKeys("abc123");
        // Close the browser
        driver.quit();
    }
}

