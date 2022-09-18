package day20.instructor;

import day20.instructor.dataProviders.DataProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _01_DataProviders {
    /**
     *    URL: https://employee-management-39848.herokuapp.com/
     *    username: user
     *    password: user123
     * 1. Verify login functionality (skipped)
     * 2. Verify Display Options
     *
     *    URL: http://automation.techleadacademy.io/#/usermgt
     * 3. Verify admin can add new users as student, instructor and mentor
     *
     * 4. Storing dataProviders in separate package
     */


    @Test(dataProvider = "viewOptions", dataProviderClass = DataProviders.class)
    public void test01(String option){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://employee-management-39848.herokuapp.com/");

        //login
        driver.findElement(By.name("username")).sendKeys("user");
        driver.findElement(By.name("password")).sendKeys("user123");
        driver.findElement(By.tagName("button")).click();

        //click view options
        driver.findElement(By.xpath("//button[text()='" + option + "']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        int count = 0;

        if(option.equalsIgnoreCase("all")){
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//tbody/tr"), 50));
        }else{
            count = Integer.valueOf(option);
            wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//tbody/tr"), count));
        }

        List<WebElement> allTrs = driver.findElements(By.xpath("//tbody/tr"));

        if(option.equalsIgnoreCase("all")){
            Assert.assertTrue(allTrs.size() > 50);
        }else{
            Assert.assertEquals(allTrs.size(), count);
        }

        driver.close();

    }

    @Test(testName = "User Role testing", dataProvider = "userData", dataProviderClass = DataProviders.class)
    public void test02(String firstName, String lastName, String number, String email, String role){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/usermgt");

        //fill out form
        driver.findElement(By.id("Firstname")).sendKeys(firstName);
        driver.findElement(By.id("Lastname")).sendKeys(lastName);
        driver.findElement(By.id("Phonenumber")).sendKeys(number);
        driver.findElement(By.id("Email")).sendKeys(email);

        //selecting role
        Select select = new Select(driver.findElement(By.id("Select-role")));
        select.selectByVisibleText(role);

        //adding a user
        driver.findElement(By.id("submit-btn")).click();

        //verify if role is displayed as expected
        Assert.assertTrue(driver.findElement(By.xpath("//td[text()='" + role + "']")).isDisplayed());

        driver.close();
    }


}
