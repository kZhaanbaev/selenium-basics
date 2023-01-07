package day04.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1_Solved {
    public static void main(String[] args) {
        /**
         * 1. Open automation practice web page
         * 2. Navigate to "Inputs" section of automation website directly
         * 3. Enter Message "Hello world"
         * 4. Click "Show message"
         * 5. Verify message displayed is same as expected
         */

        //Code goes here...
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/inputs");
        String expectedWord = "Hello world";

        driver.findElement(By.id("message")).sendKeys(expectedWord);
        driver.findElement(By.name("button1")).click();

        String actualWord = driver.findElement(By.name("message1")).getText();

        if (actualWord.equals(expectedWord)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
