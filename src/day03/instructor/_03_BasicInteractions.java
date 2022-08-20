package day03.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_BasicInteractions {
    public static void main(String[] args) {
        /**
         * 1. Open google page
         * 2. Input "selenium" keyword in searchbar
         * 3. Click Search button
         * 4. Get value of href attribute of Wikipedia linkText of search result mini window
         *  4.1 Verify expected vs actual
         * 5. Print out header of the first result item
         *  5.1 Verify if word contains a word "selenium"
         * 6. Verify if button "Shopping" is enabled
         * 7. Verify if google logo on top left of the page is displayed
         */

        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        //1
        driver.get("https://google.com");

        //2
        driver.findElement(By.name("q")).sendKeys("selenium");

        //3
        driver.findElement(By.name("btnK")).click();

        //4
        System.out.println(driver.findElement(By.linkText("Wikipedia")).getAttribute("href"));



        driver.close();
    }
}
