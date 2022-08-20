package day03.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _01_NavigateMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        //1. Navigate methods
        driver.navigate().to("https://youtube.com");

        //action 2 to click on one of the videos

        //2. navigate() vs get()
        driver.get("https://google.com");

        //action 2 to click on one of the videos



        driver.close();

    }
}
