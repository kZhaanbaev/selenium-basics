package day09.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //working with texts
        //a[text()='Registry']
        //a[text()='Alert']

        //sub-strings of text - starts-with
        //a[starts-with(text(), 'Book')]


        //sub-strings of text - contains
        //a[contains(text(), 'Music')]


        //sub-string of attribute - start-with
        //css -> a[class^='value']
        //xpath -> //a[starts-with(@class, 'value')]
        //a[starts-with(@href, 'http://the-internet')]

        //sub-string of attribute - contains
        //css -> a[class*='value']
        //xpath -> //a[contains(@class, 'value')]
        //*[contains(@class, 'nav_a')]


        //*[text()='Car' or contains(@name, 'car') or starts-with(text(), 'C')]
    }
}
