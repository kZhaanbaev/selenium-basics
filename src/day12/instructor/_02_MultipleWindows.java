package day12.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class _02_MultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //What is considered as multiple windows in selenium?

        //What is GUID (Global Unique Identifier) and how to locate it?
        driver.get("http://automation.techleadacademy.io/#/home");
        String mainWindowID = driver.getWindowHandle();
        //System.out.println(mainWindowID);


        Thread.sleep(3000);
        //Example: Home page -> sauce demo link texts -> print titles of the pages
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Saucedemo")).click();

        Thread.sleep(3000);
        Set<String> allWindowIDs = driver.getWindowHandles();
        //allWindowIDs.forEach(a -> System.out.println(a));

        for(String each: allWindowIDs){
            if (!each.equals(mainWindowID))
                driver.switchTo().window(each);
        }

        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.close();

        Thread.sleep(3000);
        //How to return to the main page?
        driver.switchTo().window(mainWindowID);
        System.out.println(driver.getTitle());

        Thread.sleep(3000);
        //Test second link text
        driver.findElement(By.linkText("Internet")).click();

        Thread.sleep(3000);
        Set<String> allWindowIDs2 = driver.getWindowHandles();
        allWindowIDs2.forEach(a -> System.out.println(a));

        for(String each: allWindowIDs2){
            if (!each.equals(mainWindowID))
                driver.switchTo().window(each);
        }

        System.out.println(driver.getTitle());

        //Difference between driver.close and driver.quit?

        Thread.sleep(3000);

        driver.quit();

        //Class Task 2 - Homework
        
    }
}
