package day19.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _01_ClassTask_Solved {
    /**
     * NOTE: Use name and description test annotations in each test case
     *
     * US1001: Verify "Double clicked" text is displayed when user double-clicks on the "Double-click me" button
     *          URL: http://automation.techleadacademy.io/#/actionclass
     *
     * US1002 Verify user can sum 2 numbers correctly in "Two Input Fields" section
     *          URL: http://automation.techleadacademy.io/#/inputs
     */

    @Test(testName = "US1001: Test Double click button", description = "Verify double click is working")
    public void test01(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/actionclass");

        Actions actions = new Actions(driver);

        WebElement dblClickBtn = driver.findElement(By.xpath("//button[@class='btn btn-warning m-2 btn-lg']"));
        actions.doubleClick(dblClickBtn).perform();

        Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Double clicked']")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.xpath("//button[@class='btn btn-danger m-2 btn-lg']")).getText(), "Double clicked");

        driver.close();
    }
}
