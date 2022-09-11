package day15.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionsClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("http://automation.techleadacademy.io/#/inputs");
//
//        //selecting a text that was entered by a user
//        WebElement element = driver.findElement(By.id("message"));
//        element.sendKeys("TLA Automation");
//
//        Actions actions = new Actions(driver);
//        actions.keyDown(element, Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();
//
//        //copy above selected text and paste in other place
//        actions.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).perform();
//
//        WebElement element2 = driver.findElement(By.id("a"));
//
//        actions.keyDown(element2, Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();

        //Reading tooltips:
        //1. With "title" attribute (youtube.com)

        //2. With hover over method (Actions page)
        driver.get("http://automation.techleadacademy.io/#/actionclass");
        WebElement element = driver.findElement(By.xpath("//button[@class='btn btn-success btn-lg m-2']"));

        System.out.println(element.getAttribute("data-tip"));

        //Class Task 2

        Thread.sleep(3000);
        driver.close();
    }
}
