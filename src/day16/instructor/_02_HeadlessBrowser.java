package day16.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _02_HeadlessBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io");

        System.out.println(driver.findElement(By.id("title")).getText());

        driver.findElement(By.linkText("User-Mgt")).click();
        System.out.println(driver.findElement(By.tagName("h2")).getText());

        driver.close();
    }
}
