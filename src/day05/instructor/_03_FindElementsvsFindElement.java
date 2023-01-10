package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_FindElementsvsFindElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");

        //1. What is the difference between findElement() vs findElements()
        // Nav buttons on practice home page
        List<WebElement> navButtons = driver.findElements(By.className("navbar-brand"));
        System.out.println(navButtons.size());

        for(WebElement each: navButtons){
            System.out.println(each.getText());
        }

        //System.out.println(navButtons.get(2).getText());


        //2.


        driver.close();

        //NOTE: ClassTask 2
    }
}
