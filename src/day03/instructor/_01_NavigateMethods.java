package day03.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _01_NavigateMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver"); // <<--- update to correct path
        WebDriver driver = new ChromeDriver();

        //NAVIGATION METHODS
        //1. Navigate to

        //2. Navigate back

        //3. Navigate refresh

        //2. navigate() vs get()


        driver.close();

    }

    void solution(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver"); // <<--- update to correct path
        WebDriver driver = new ChromeDriver();

        //NAVIGATION METHODS
        //1. Navigate to
        driver.navigate().to("https://google.com");

        //2. Navigate back
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();

        //3. Navigate refresh
        driver.navigate().refresh();

        //2. navigate() vs get()
        /**
         * driver.get("https://google.com");
         * driver.navigate().to("https://amazon.com");
         * ----
         * Explain following:
         * get() - method will wait for the page to finish loading
         * navigate() - method will not wait and will proceed running next
         * line of code immediately after opening the browser and entering
         * the url.
         */

        driver.close();
    }
}
