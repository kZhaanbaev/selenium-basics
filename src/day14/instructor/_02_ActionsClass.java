package day15.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionsClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/actionclass");

        Actions actions = new Actions(driver);

        //Hover over
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.cssSelector(".btn"));

        actions.moveToElement(element).perform();

        //Double click
        Thread.sleep(3000);
        actions.doubleClick(driver.findElement(By.xpath("//button[text()='Double-click me']"))).perform();

        //Right click
        Thread.sleep(3000);
        actions.contextClick(driver.findElement(By.xpath("//button[text()='Right-click me']"))).perform();

        //Class Task 1


        Thread.sleep(3000);
        driver.close();
    }
}
