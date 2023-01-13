package day07.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassTask2_Solved {
    /**
     *  1. Open url http://automation.techleadacademy.io/#/selectors
     *  2. Print out all sub-child elements that has class value starting with a keyword "sub"
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/selectors");

        List<WebElement> list = driver.findElements(By.cssSelector("div[class^='sub']"));
        list.forEach(each -> System.out.println(each.getText()));

        driver.close();
    }
}
