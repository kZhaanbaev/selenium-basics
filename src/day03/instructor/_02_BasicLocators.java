package day03.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//NOTE: Explain .findElement() method before locators

public class _02_BasicLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver"); // <<--- update to correct path
        WebDriver driver = new ChromeDriver();

        driver.get("http://automation.techleadacademy.io/#/home");

        //locate by id
        //Print out on home page "Automation with Selenium"
        String text = driver.findElement(By.id("title")).getText();
        System.out.println(text);

        //locate by name
        //Print paragraph under the title on home page
        System.out.println(driver.findElement(By.name("paragraph")).getText());

        //locate by className
        //Print footer on home page
        System.out.println(driver.findElement(By.className("row")).getText());

        //locate by tagName
        //Print title again but by using tagName
        System.out.println(driver.findElement(By.tagName("h1")).getText());

        //locate by linkText
        //Print "Internet" link from the list on the bottom of the page
        //and check if it's displayed
        System.out.println(driver.findElement(By.linkText("Internet")).isDisplayed());

        //locate by partialLinkText
        //Print all links that contains letter "T"
        System.out.println(driver.findElement(By.partialLinkText("T")).getText());

        //locating and getting an attribute value
        //example 1:
        System.out.println(driver.findElement(By.id("selenium-img")).getAttribute("src"));

        //example 2:
        System.out.println(driver.findElement(By.linkText("PHP Travels")).getAttribute("href"));

        driver.close();
    }
}
