package day12.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_MultipleWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //What is considered as multiple windows in selenium?

        //What is GUID (Global Unique Identifier) and how to locate it?

        //Example: Home page -> sauce demo link texts -> print titles of the pages

        //How to return to the main page?

        //Difference between driver.close and driver.quit?



        //Class Task 2
        
    }
}
