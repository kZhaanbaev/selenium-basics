package day04.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2_Solved {
    public static void main(String[] args) {
        /**
         * 1. Input number a and number b
         * 2. Click Get Total button
         * 3. Verify if sum of 2 numbers are as expected
         */

        //Code 2 goes here...
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/inputs");

        driver.findElement(By.id("a")).sendKeys("10");
        driver.findElement(By.id("b")).sendKeys("8");
        driver.findElement(By.name("button2")).click();

        String expectedNumber = "18";
        String actualNumber = driver.findElement(By.name("answer2")).getText();

        if (actualNumber.equals(expectedNumber)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
