package day07.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_CssLocators {
    /**
     * 1. tag + class + attribute (chaining)
     * 2. sub-string matches:
     *      a. starts-with
     *      b. ends-with
     *      c. contains
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/");

        //chaining = using multiple attributes

        /**
         * tag + attr1 + attr2
         * tag[attr1=value][attr2=value]
         *
         * Example: div[class=blue][href=https://blueweb.com]
         *
         * Example by using findElement() => driver.findElement(By.cssSelector("a[class=value][name=value]"));
         *
         * Real example: Locate header on home page
         * show how to locate from the browser by inspecting first and then code => h1[class=header-text][name=h1-text]
         */

        System.out.println(driver.findElement(By.cssSelector("h1[class=header-text][name=h1-text]")).getText());


        //sub-strings work with values of the attributes only
        //sub-string starts-with

        /**
         * tag[attr^=startingValue]
         * Just raw example: finds title that starts with text "You are looking"
         * a[title^='You are looking']
         *
         * Example: To find all links on home page that starts with "http://ww"
         * a[href^='http://www.']
         */

        List<WebElement> listStartsWith = driver.findElements(By.cssSelector("a[href^='http://']"));
        listStartsWith.forEach(each -> System.out.println(each.getText()));

        //Note: ClassTask2


        //sub-string ends-with

        /**
         * tag[attr$=endingValue]
         *
         * Just raw example: finds title that ends with text "good day"
         * a[title$='good day']
         *
         * Example: links with href values that ends with ".com/"
         * a[href$='.com/']
         */
        List<WebElement> listEndsWith = driver.findElements(By.cssSelector("a[href$='.com/']"));
        listEndsWith.forEach(each -> System.out.println(each.getText()));

        //Note: ClassTask3


        //sub-string contains

        /**
         * tag[attr*=startingValue]
         *
         * Just a raw example: finds title that contains text "forecast"
         * a[title*='forecast']
         *
         * Example: links that contain "practice" in href value
         * a[href*='practice']
         */
        List<WebElement> listContains = driver.findElements(By.cssSelector("a[href*='practice']"));
        listContains.forEach(each -> System.out.println(each.getText()));

        //Note: ClassTask4


        driver.close();

    }
}
