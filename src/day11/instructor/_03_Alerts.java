package day11.instructor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //NOTE: Follow README file first

        //Example: Add apple, Eat apple etc.
        driver.get("http://automation.techleadacademy.io/#/alert");

        driver.findElement(By.xpath("//button[@class='btn btn-success m-2']")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-success']")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("333");

        System.out.println(alert2.getText());
        alert2.accept();


        //NOTE: ClassTask3

        Thread.sleep(3000);
        driver.close();

    }
}
