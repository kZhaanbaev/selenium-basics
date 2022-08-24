package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_CssLocators {
    public static void main(String[] args) {
        //tagAndId();
        //tagAndClass();
        tagAndAttribute();
    }

    public static void tagAndId(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/");

        //By id in css selector
        driver.findElement(By.id("title"));
        System.out.println(driver.findElement(By.cssSelector("#title")).getText());

        //1. tag + id(#)
        System.out.println(driver.findElement(By.cssSelector("h1#title")).getText());

        //2. tag + [id=value]
        System.out.println(driver.findElement(By.cssSelector("h1[id=title]")).getText());
    }

    public static void tagAndClass(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/");

        //By class in css selector
        driver.findElement(By.className("text"));
        System.out.println(driver.findElement(By.cssSelector(".text")).getText());

        //1. tag + class(.)
        System.out.println(driver.findElement(By.cssSelector("div.text")).getText());

        //2. tag + [class=value]
        System.out.println(driver.findElement(By.cssSelector("div[class=text]")).getText());

        // use '' in case there are spaces
        System.out.println(driver.findElement(
                By.cssSelector("div[class='a-link-normal as-title-block-right see-more truncate-1line']")).getText());

        driver.close();
    }

    public static void tagAndAttribute(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/");

        // tag + [attribute=value]
        System.out.println(driver.findElement(By.cssSelector("a[href='https://phptravels.com/demo/']")).getText());

        System.out.println(driver.findElement(By.cssSelector("h1[name='h1-text']")).getText());

        driver.close();
    }
}
