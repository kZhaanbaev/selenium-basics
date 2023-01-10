package day05.student;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassTask2_Solved {
    public static void main(String[] args) {
        /**
         * Task:
         * 1. Print out all links' text on the bottom of the home page of automation practice website.
         * 2. Print out "Saucedemo" link's text only from the list
         */

        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");

        List<WebElement> links = driver.findElements(By.className("link"));

        for(WebElement each: links){
            System.out.println(each.getText());
        }

        System.out.println("====");
        System.out.println(links.get(5).getText());


    }
}
