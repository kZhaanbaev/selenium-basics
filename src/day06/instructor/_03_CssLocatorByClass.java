package day06.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_CssLocatorByClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/");

        //By class in css selector => print first text under the title
        driver.findElement(By.className("text"));
        System.out.println(driver.findElement(By.cssSelector(".text")).getText());

        //1. tag + class(.) => print first text under the title
        System.out.println(driver.findElement(By.cssSelector("div.text")).getText());

        //2. tag + [class=value] => print first text under the title
        System.out.println(driver.findElement(By.cssSelector("div[class=text]")).getText());

        // use '' in case there are spaces => on Calendar page print month/year
        driver.findElement(By.linkText("Calendar")).click();
        System.out.println(driver.findElement(
                By.cssSelector("span[class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).getText());

        driver.close();

        //Note: ClassTask2
    }
}
