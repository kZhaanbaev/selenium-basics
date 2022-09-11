package day16.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_JsExecutor {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/home");

        //Scroll into view
        WebElement element = driver.findElement(By.linkText("Shopping Cart"));
        moveIntoView(element, driver);

        highlightElement(element, driver);

    }

    public static void moveIntoView(WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        sleep(2000L);

        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void highlightElement(WebElement element, WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        sleep(2000L);

        js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", element);
        js.executeScript("arguments[0].style.backgroundColor='yellow'", element);

        sleep(2000L);

        js.executeScript("arguments[0].setAttribute('style','border: none');", element);
        js.executeScript("arguments[0].style.backgroundColor=null", element);
    }

    public static void sleep(Long milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
