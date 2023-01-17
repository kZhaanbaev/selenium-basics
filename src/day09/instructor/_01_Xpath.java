package day09.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io");

        //tag + attribute
        //css -> div[class='value']
        //xpath -> //div[@class='value']
        //locate header of main page


        //tag + attribute + attribute
        //css-> div[attr1='value1'][attr2='value2']
        //xpath->   //div[@attr1='value'][@attr2='value2']
        //locate header of main page using 2 attributes


        //asterisk *
        //xpath -> //*[@class='value']
        //print out all text's under the header


        driver.close();

        //NOTE: ClassTask1

    }
}
