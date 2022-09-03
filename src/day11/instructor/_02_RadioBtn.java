package day11.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_RadioBtn {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

        //section: "Radio Button"
        driver.findElement(By.id("exampleRadios2")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("exampleRadios1")).click();

        //ClassTask 2: 15min

    }
}
