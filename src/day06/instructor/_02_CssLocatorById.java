package day06.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_CssLocatorById {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/");

        //By id in css selector => print title of the page
        driver.findElement(By.id("title"));
        System.out.println(driver.findElement(By.cssSelector("#title")).getText());

        //1. tag + id(#) => print title of the page
        System.out.println(driver.findElement(By.cssSelector("h1#title")).getText());

        //2. tag + [id=value] => print title of the page
        System.out.println(driver.findElement(By.cssSelector("h1[id=title]")).getText());

        driver.close();

        //Note: ClassTask1
    }
}
