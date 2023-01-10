package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Review {
    /**
     * 1. Open https://www.udemy.com/
     * 2. Verify "Log in" button is displayed and clickable.
     * 3. Verify title of the page is "Online Courses - Learn Anything, On Your Schedule | Udemy".
     * 4. Verify url of the home page starts with "https" to make sure it's secured.
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.udemy.com/");

        System.out.println(driver.findElement(By.linkText("Log in")).isDisplayed());


        driver.close();

    }
}
