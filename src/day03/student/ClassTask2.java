package day03.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2 {
    public static void main(String[] args) {
        /**
         * 1. Open automation practice web page
         * 2. Navigate to "Inputs" section of automation website directly
         * 3. Enter Message "Hello world"
         * 4. Click "Show message"
         * 5. Verify message displayed is same as expected
         */


        //Code goes here...
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/inputs");
        String expectedWord = "Hello world";

        driver.findElement(By.id("message")).sendKeys(expectedWord);
        driver.findElement(By.name("button1")).click();

        String actualWord = driver.findElement(By.name("message1")).getText();

        if (actualWord.equals(expectedWord)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }


        /**
         * 1. Input number a and number b
         * 2. Click Get Total button
         * 3. Verify if sum of 2 numbers are as expected
         */

        //Code 2 goes here...
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


        /**
         * 1. Fill out the form in "Contact Us Today!" section
         * 2. Verify message "Thanks for contacting us,
         * we will get back to you shortly." is displayed
         */

        //Code 3 goes here...
        driver.findElement(By.name("first_name")).sendKeys("Caesar");
        driver.findElement(By.name("last_name")).sendKeys("Giant");
        driver.findElement(By.name("email")).sendKeys("giantboy@gmail.com");
        driver.findElement(By.name("phone")).sendKeys("9999999999");
        driver.findElement(By.name("address")).sendKeys("101 Dogs Landing");
        driver.findElement(By.name("city")).sendKeys("Heavenly");
        driver.findElement(By.name("state")).sendKeys("Maryland");
        driver.findElement(By.name("zip")).sendKeys("55555");
        driver.findElement(By.name("button3")).click();

        String expectedMessage = "Thanks for contacting us, we will get back to you shortly.";
        String actualMessage = driver.findElement(By.name("answer3")).getText();

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
