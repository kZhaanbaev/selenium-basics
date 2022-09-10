package day15.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _01_ClassTask_Solved {
    /**
     * 	1. Go to url: http://automationpractice.com/index.php
     * 	2. Print out text "Add to cart" and "More" of item "Blouse"
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");
        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(By.xpath("//a[@title='Blouse']"))).perform();

        System.out.println(driver.findElement(By.xpath("//a[@data-id-product='2']")).getText());

        System.out.println(driver.findElement(By.xpath("//a[@data-id-product='2']/following-sibling::a")).getText());

        driver.close();
    }
}
