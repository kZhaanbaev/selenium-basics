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
         * 2. Click on Pricing nav button
         * 3. Print out all questions under "Frequently asked questions" section
         * 4. Click on Sign in button
         * 5. Input "test@test.com" in email address field
         * 6. Input "test" in password field
         * 7. Click on "Sign in" button
         * 8. Verify a web element with text "Incorrect username or password." is displayed
         * Note: add Thread.sleep() - about 2-3 seconds if text doesn't show up fast enough
         */

        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com");

        driver.findElement(By.xpath("//a[text()='Pricing']")).click();

        Thread.sleep(2000);

        List<WebElement> headers = driver.findElements(By.xpath("//h3[starts-with(@class, 'd-inline-block')]"));
        headers.forEach(a -> System.out.println(a.getText()));

        driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("test@test.com");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@test.com");

        driver.findElement(By.xpath("//input[@value='Sign in']")).click();


        Thread.sleep(2000);

        System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Incorrect username or password.')]")).isDisplayed());



        driver.close();

    }
}
