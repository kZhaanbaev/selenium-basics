package day02.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_1 {
    public static void main(String[] args) throws InterruptedException {
        //Connect the program with the chromedriver and geckodriver
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

//        System.setProperty("webdriver.gecko.driver", "pathToDriver/geckodriver");
//        WebDriver driver = new FirefoxDriver();

        //Launch a browser
        driver.get("https://google.com");

        //holds program until n number of milliSeconds
        Thread.sleep(3000);

        //get title of the page
        System.out.println(driver.getTitle());

        //get current url of the webpage
        System.out.println(driver.getCurrentUrl());

        //close the browser
        driver.close();
    }



}
