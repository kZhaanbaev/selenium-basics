package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_FindElementsvsFindElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");

        //1. What is the difference between findElement() vs findElements()
        // Nav buttons on practice home page
        List<WebElement> paragraphs = driver.findElements(By.className("navbar-brand"));
        System.out.println(paragraphs.size());

        for(WebElement each: paragraphs){
            System.out.println(each.getText());
        }

        //System.out.println(paragraphs.get(2).getText());


        //2.


        driver.close();
    }
}
