package day12.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_PopUps {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/popup");

        //What is browser pop-ups? Pop-ups vs alerts?

        //Example: Pop-Up -> Message
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("This is my message");




        //Class Task 1
    }



}
