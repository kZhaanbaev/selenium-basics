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
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/actionclass");

        /**
         * Reading tooltips:
         * Tooltips with attribute values
         *  - With "title" attribute (youtube.com)
         *  - With "data-tip" attribute on Action-class page
         */
        WebElement element3 = driver.findElement(By.xpath("//button[@class='btn btn-success btn-lg m-2']"));
        System.out.println(element3.getAttribute("data-tip"));

        //2. With hover over method (Actions page)
        WebElement element4 = driver.findElement(By.xpath("//div[@data-id='tooltip']"));

        //Print without hovering over first
        System.out.println(element4.getText() + " <<");

        //Print with hover over using Actions class
        Actions actions = new Actions(driver);
        actions.moveToElement(element3).perform();
        Thread.sleep(2000);
        System.out.println(element4.getText() + " >>2");


        //Class Task 2


//        Actions actions = new Actions(driver);
//
//        WebElement element = driver.findElement(By.id("todo1"));
//        WebElement destination = driver.findElement(By.id("div1"));
//
//        Thread.sleep(2000);
//        //actions.dragAndDrop(element, destination).perform();
//        actions.dragAndDropBy(element, 790, 650).perform();


        Thread.sleep(3000);
        driver.close();
    }
}
