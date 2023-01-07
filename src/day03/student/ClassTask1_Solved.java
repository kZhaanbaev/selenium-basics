package day03.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1_Solved {
    public static void main(String[] args) {
        /**
         * NOTE: Complete the task using navigate methods only
         * 1. Navigate to "https://asoftmurmur.com/"
         *      print out the title of the page
         * 2. Navigate to "https://agoodmovietowatch.com/"
         *      print out the url of the page
         * 3. Navigate back
         *      verify title contains a word "murmur"
         * 4. Refresh the page
         * 5. Navigate forward
         *      verify title ends with a word "Watch"
         */

        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //1
        driver.navigate().to("https://asoftmurmur.com/");
        System.out.println(driver.getTitle());

        //2
        driver.navigate().to("https://agoodmovietowatch.com/");
        System.out.println(driver.getCurrentUrl());

        //3
        driver.navigate().back();
        System.out.println(driver.getTitle().toLowerCase().contains("murmur"));

        //4
        driver.navigate().refresh();

        //5
        driver.navigate().forward();
        System.out.println(driver.getTitle().endsWith("Watch"));

        driver.close();
    }
}
