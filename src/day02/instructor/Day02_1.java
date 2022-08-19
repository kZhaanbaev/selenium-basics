package day02.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        //holds program until n number of milliSeconds
        Thread.sleep(3000);

        //get title of the page
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.close();
    }



}
