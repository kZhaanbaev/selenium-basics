package day06.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_HomeworkReview {
    /**
     * day05.ClassTask3
     * Convert Homework2 from day04 package into using css selectors only
     *
     * Open the browser -> www.automationpractice.com
     * Click "Dresses" button
     * Print out value of "href" attributes of items under "Dresses" section
     * Then Click on "Casual dresses"
     * Verify "header" of that section's name is "CASUAL DRESSES"
     * Navigate back
     * Click on "Evening Dresses"
     * Print out and Verify title is "Evening Dresses - My Store"
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationpractice.com");
        driver.manage().window().maximize();

        //driver.findElement(By.cssSelector("a[title='Dresses']")).click();

        List<WebElement> dressesBtns = driver.findElements(By.cssSelector("a[title='Dresses']"));
        dressesBtns.get(1).click();

        List<WebElement> dresses = driver.findElements(By.cssSelector("a[class=product-name]"));

        for(int i = 1; i < dresses.size(); i++){
            System.out.println(dresses.get(i).getAttribute("href"));
        }

        driver.findElement(By.cssSelector(".subcategory-name")).click();

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".cat-name")).getText().equals("CASUAL DRESSES "));

        driver.navigate().back();

        List<WebElement> eveningDressesBtn = driver.findElements(By.cssSelector(".subcategory-name"));
        eveningDressesBtn.get(1).click();

        System.out.println(driver.getTitle().equals("Evening Dresses - My Store"));

        driver.close();

    }


}
