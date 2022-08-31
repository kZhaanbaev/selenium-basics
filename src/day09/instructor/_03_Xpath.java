package day09.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //indexes [n]
        //div[@class='text'][1]
        //nav[1]/a[7]
        //div[@class='home-page']/a[4]
        //Note: index starts with 1 not 0

        //keywords: last(), last()-n
        //div[@class='home-page']/a[last()]
        //div[@class='home-page']/a[last()-5]
    }
}
