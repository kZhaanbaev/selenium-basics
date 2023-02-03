package day15.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _02_ClassTask_Solved {
    /**
     * 	1. Go to url: "https://etsy.com"
     * 	2. Print out tooltip "Cart".
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://etsy.com");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Cart']/span[@class='wt-icon']"))).perform();

        System.out.println(driver.findElement(By.xpath("//span[@role='tooltip']")).getText());

        driver.close();
    }
}
