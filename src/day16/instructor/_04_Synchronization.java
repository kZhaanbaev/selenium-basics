package day16.instructor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class _04_Synchronization {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/files");

        //fluent wait
    }

    static WebElement fluentWait(By locator, WebDriver driver){
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(30));
        wait.pollingEvery(Duration.ofSeconds(3));
        wait.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        wait.withMessage("Waited for 15 seconds to find element --> " + locator.toString());

        WebElement element = (WebElement) wait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(locator);
            }
        });

        return element;
    }

}
