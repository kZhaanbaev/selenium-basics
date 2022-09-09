package day14.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_iFrames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/iframes");

        //access TLA website and print main text "Hello! I am the parent iFrame without switching
        driver.switchTo().frame("parent-iframe");
        System.out.println(driver.findElement(By.id("iframe-text")).getText());

        //access parent iFrame and print text again with switching

        //access child iFrame - budget calc
        //  input Transaction name and amount

        driver.switchTo().frame("budget-tracker");
        driver.findElement(By.id("t-name")).sendKeys("flower");
        driver.findElement(By.id("t-amount")).sendKeys("1");

        //navigation from one iframe to another, child to parent, etc.
        driver.switchTo().parentFrame();

        //access child iFrame - wiki
        //  print listed languages
        driver.switchTo().frame("wiki");
        List<WebElement> languages = driver.findElements(By.xpath("//a[@class='link-box']/strong"));
        languages.forEach(a -> System.out.println(a.getText()));


        Thread.sleep(3000);
        driver.close();

        //Class Task 1
    }
}
