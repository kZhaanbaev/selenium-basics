package day09.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //tag + attribute
        //css -> div[class='value']
        //xpath -> //div[@class='value']

        //tag + attribute + attribute
        //css-> div[attr1='value1'][attr2='value2']
        //xpath->   //div[@attr1='value'][@attr2='value2']

        //using "and" and "or" keyword when using 2 attributes
        //xpath -> //div[@attr1='value' and @attr2='value2']
        //xpath -> //div[@attr1='value' or @attr2='value2']

        //parent -> child
        //css ->    div[class='value']>div[alt='value'] -> immediate children
        //xpath ->  //div[@class='value']/div[@alt='value'] -> immediate children

        //parent -> all children
        //css ->    div[class='value'] div[alt='value'] -> any webElement under parent hierarchy
        //xpath ->  //div[@class='value']//div[@alt='value'] -> any webElement under parent hierarchy

        //asterisk *
        //xpath -> //*[@class='value']

    }
}
