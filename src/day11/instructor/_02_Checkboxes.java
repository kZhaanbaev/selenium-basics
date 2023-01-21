package day11.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");


        //section: "Check box"
        //to check click 1 time. Multiple options can be checked at the same time.
        driver.findElement(By.id("defaultCheck1")).click();
        driver.findElement(By.id("defaultCheck3")).click();

        Thread.sleep(3000);

        //to uncheck click again
        driver.findElement(By.id("defaultCheck1")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("defaultCheck3")).click();

        //driver.close();

    }
}
