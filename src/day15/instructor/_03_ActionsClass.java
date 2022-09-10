package day15.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;


public class _03_ActionsClass {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/actionclass");

        Actions actions = new Actions(driver);
//
//        WebElement element = driver.findElement(By.id("todo1"));
//        WebElement destination = driver.findElement(By.id("div1"));
//
//        Thread.sleep(2000);
//        //actions.dragAndDrop(element, destination).perform();
//        actions.dragAndDropBy(element, 790, 650).perform();

        //Robot Class
        Robot robot = new Robot();


        robot.mouseMove(500, 740);
        Thread.sleep(2000);

        //robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        actions.doubleClick().perform();
        actions.clickAndHold().perform();


        robot.mouseMove(900, 800);
        //robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        actions.release().perform();




        Thread.sleep(3000);
        driver.close();
    }
}
