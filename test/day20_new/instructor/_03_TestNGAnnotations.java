package day20_new.instructor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _03_TestNGAnnotations {
    /**
        //5. "priority"

        //6. "invocationCount" - Verify alert is getting displayed within 10 seconds on Synchronization page
              using WebDriverWait

        //7. "invocationTimeOut" - Verify input text is getting displayed within 10 seconds on Synchronization page,
              substitute WebDriverWait (applies to all counts together as a whole)

        //8. "timeOut" - Verify input text is getting displayed within 10 seconds on Synchronization page,
              substitute WebDriverWait (applies to specific test case, no count needed)

        //9. "dataProvider" - Verify all 18 navigation buttons are working as expected by taking to correct pages

        //ClassTask 2

    */

    /*
    Write 3 below test cases first to be able to show the order change
    By default Tests are ordered alphabetically
    Used to sort execution order. Can take positive, negative and 0
    Smaller the number gets higher the priority becomes
    */
    @Test(priority = -1)
    public void testGoogle(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://google.com");

        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
    }

    @Test(testName = "Test Header", priority = 1)
    public void test02(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/home");

        String actualHeader = driver.findElement(By.id("title")).getText();
        String expectedHeader = "Automation with Selenium";

        Assert.assertEquals(actualHeader, expectedHeader);
        driver.close();
    }

    @Test(testName = "Test Input", description = "Testing if input data is displayed as expected")
    public void test03(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/inputs");

        String testData = "Blue Sky";
        driver.findElement(By.id("message")).sendKeys(testData);
        driver.findElement(By.name("button1")).click();

        WebElement element = driver.findElement(By.xpath("//span[@name='message1' and text()='" + testData + "']"));
        Assert.assertTrue(element.isDisplayed());

        driver.close();
    }

    /*
    1. First try only "invocationCount" -> runs 4 times if you put 4 etc. Can be used sometimes when functionality is not
    stable and passes sometimes and fails sometimes
    2. Then add "invocationTimeOut" -> time limit can be set for execution of all invocations
     */
    @Test(testName = "Test Alert", description = "Testing alert time to display", invocationCount = 6, invocationTimeOut = 40000)
    public void test04(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/synchronization");

        driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.close();
    }

    //"timeOut" is set to limit execution time of one test case. If it reaches timeOut time it will throw exception.
    @Test(testName = "Test Input timeOut", description = "Testing if input data is displayed as expected", timeOut = 8000)
    public void test05(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io/#/inputs");

        String testData = "Blue Sky";
        driver.findElement(By.id("message")).sendKeys(testData);
        driver.findElement(By.name("button1")).click();

        WebElement element = driver.findElement(By.xpath("//span[@name='message1' and text()='" + testData + "']"));
        Assert.assertTrue(element.isDisplayed());

        driver.close();
    }

    /*
    In TestNG, data providers are methods that provide test data to test cases.
    They are annotated with the @DataProvider annotation and are used to supply data to
    a test method through the @Test annotation's dataProvider attribute. The data provider method
    returns an array of objects, with each set of data representing a separate test iteration.
    The test method is run multiple times, once for each set of data provided by the data provider.
    This allows developers to test their code with different inputs, providing better test coverage.
    The data provider method and the test method can be in the same class or in different classes,
    as long as they are accessible to each other.
     */
    @DataProvider(name = "navButtons")
    public Object[][] dataP(){
        Object[][] data = new Object[6][2];

        data[0][0] = "Home";
        data[0][1] = "http://automation.techleadacademy.io/#/home";

        data[1][0] = "Curriculum";
        data[1][1] = "http://automation.techleadacademy.io/#/curriculum";

        data[2][0] = "Notes21";
        data[2][1] = "http://automation.techleadacademy.io/#/notes";

        data[3][0] = "Inputs";
        data[3][1] = "http://automation.techleadacademy.io/#/inputs";

        data[4][0] = "Selectors";
        data[4][1] = "http://automation.techleadacademy.io/#/selectors21";

        data[5][0] = "Select-class";
        data[5][1] = "http://automation.techleadacademy.io/#/selectclass";

        return data;
    }

    @Test(testName = "Data Provider test", dataProvider = "navButtons")
    public void test06(String btnName, String url){
        //Verify all 18 navigation buttons are working as expected by taking to correct pages
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io");

        driver.findElement(By.linkText(btnName)).click();
        Assert.assertEquals(driver.getCurrentUrl(), url);

        driver.close();
    }

    //ClassTask 2


}
