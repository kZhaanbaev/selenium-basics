package day09.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //tag + attribute

        //tag + attribute + attribute

        //using "and" and "or" keyword when using 2 attributes

        //parent -> child

        //parent -> all children

        //asterisk *
    }
}
