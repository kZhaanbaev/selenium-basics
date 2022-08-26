package day06.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_CssLocators {
    /**
     * 1. tag + class + attribute (chaining)
     * 2. sub-string matches:
     *      a. starts-with
     *      b. ends-with
     *      c. contains
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        //chaining = using multiple attributes
        //tag + attr1 + attr2
        //tag[attr1=value][attr2=value]

        //driver.findElement(By.cssSelector("a[class=value][name=value]"));

        //h1[class=header-text][name=h1-text]

        //sub-strings work with values of the attributes only
        //sub-string starts-with

        //tag[attr^=startingValue]
        //a[href^='http://www.']
        //a[title^='You are looking']


        //sub-string ends-with
        //tag[attr$=startingValue]
        //a[href$='http://www.']
        //a[title$='You are looking']

        //sub-string contains
        //tag[attr*=startingValue]
        //a[href*='http://www.']
        //a[title*='You are looking']
    }
}
