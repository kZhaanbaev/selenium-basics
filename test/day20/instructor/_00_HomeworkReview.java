package day20.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _00_HomeworkReview {
    /**
     * NOTE: Use dataProvider
     *
     * US1003: Verify all text links on homepage are opening on new window.
     */

    @DataProvider(name = "links")
    public Object[] data(){
        String[] arr = {
                "PHP Travels",
                "Mercury tours",
                "Internet",
                "E-commerce",
                "Passion Tea Company",
                "Saucedemo",
                "Shopping Cart"
        };
        return arr;
    }

    @Test(testName = "External links test", dataProvider = "links")
    public void test01(String link){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io");

        driver.findElement(By.linkText(link)).click();

        Assert.assertTrue(driver.getWindowHandles().size() > 1);
        driver.quit();
    }

}
