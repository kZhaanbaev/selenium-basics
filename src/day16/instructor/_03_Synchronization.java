package day16.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class _03_Synchronization {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //implicit wait goes here
        driver.get("http://automation.techleadacademy.io/#/synchronization");

        //implicitly wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //explicit waits
        driver.findElement(By.id("input-text")).sendKeys("SDET");
        driver.findElement(By.tagName("button")).click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='SDET']")));

        System.out.println(driver.findElement(By.xpath("//*[text()='SDET']")).isDisplayed());

        driver.close();
    }
}
