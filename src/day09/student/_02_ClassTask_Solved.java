package day09.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_ClassTask_Solved {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. navigate to https://github.com/
         * 2. print out following section
         *      83+ million
         *      4+ million
         *      200+ million
         *      90%
         *
         * 3. Input "test@test.com" in email address field
         * 4. Click on "Sign up for GithHub" button
         * 5. Verify text "Email domain could not be verified" is displayed
         * Note: add Thread.sleep() - about 4-5 seconds if text doesn't show up fast enough
         */

        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com");

        List<WebElement> headers = driver.findElements(By.xpath("//*[starts-with(@class, 'f3-mktg')]"));
        headers.forEach(a -> System.out.println(a.getText()));

        driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("test@test.com");

        driver.findElement(By.xpath("//button[contains(text(), 'Sign up for GitHub')]")).click();

        Thread.sleep(6000);

        String actualErrText = driver.findElement(By.xpath("//p[@id='email-err']")).getText();

        System.out.println(actualErrText.equals("Email domain could not be verified"));

        System.out.println(driver.findElement(By.xpath("//p[text()='Email domain could not be verified']")).isDisplayed());


        driver.close();

    }
}
