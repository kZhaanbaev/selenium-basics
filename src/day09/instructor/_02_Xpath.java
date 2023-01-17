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
        //locate and print href values of Saucedemo link


        //sub-strings of text - starts-with
        //a[starts-with(text(), 'Book')]
        //locate all nav button that starts with text "Select"


        //sub-string of attribute - starts-with
        //css -> a[class^='value']
        //xpath -> //a[starts-with(@class, 'value')]
        //print out all links that has href starts with "https"


        //sub-strings of text - contains
        //a[contains(text(), 'Music')]
        //print out all links that contain letter "a"


        //sub-string of attribute - contains
        //css -> a[class*='value']
        //xpath -> //a[contains(@class, 'value')]
        //print out all links that contain href value containing "www"


        driver.close();
    }
}
