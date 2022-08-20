package day03.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _02_BasicLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automation.techleadacademy.io/#/home");

        //locate by id
        String text = driver.findElement(By.id("title")).getText();
        //System.out.println(text);

        //locate by name
        //System.out.println(driver.findElement(By.name("paragraph")).getText());

        //locate by className
        //System.out.println(driver.findElement(By.className("row")).getText());

        //locate by tagName
        //System.out.println(driver.findElement(By.tagName("h1")).getText());

        //locate by linkText
        //System.out.println(driver.findElement(By.linkText("Internet")).isDisplayed());

        //locate by partialLinkText
        System.out.println(driver.findElement(By.partialLinkText("T")).getText());


        driver.close();
    }
}
