package day04.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask3_Solved {
    public static void main(String[] args) {
        /**
         * 1. Fill out the form in "Contact Us Today!" section
         * 2. Verify message "Thanks for contacting us,
         * we will get back to you shortly." is displayed
         */

        //Code 3 goes here...
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/inputs");
        driver.findElement(By.name("first_name")).sendKeys("Caesar");
        driver.findElement(By.name("last_name")).sendKeys("Giant");
        driver.findElement(By.name("email")).sendKeys("giantboy@gmail.com");
        driver.findElement(By.name("phone")).sendKeys("9999999999");
        driver.findElement(By.name("address")).sendKeys("101 Dogs Landing");
        driver.findElement(By.name("city")).sendKeys("Heavenly");
        driver.findElement(By.name("state")).sendKeys("Maryland");
        driver.findElement(By.name("zip")).sendKeys("55555");
        driver.findElement(By.name("button3")).click();

        String expectedMessage = "Thanks for contacting us, we will get back to you shortly.";
        String actualMessage = driver.findElement(By.name("answer3")).getText();

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
