package day15.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_ActionsClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/actionclass");

        //selecting a text that was entered by a user

        //copy above selected text and paste in other place

        //Reading tooltips:
        //1. With "title" attribute (youtube.com)

        //2. With hover over method (Actions page)

        //Class Task 3
    }
}
