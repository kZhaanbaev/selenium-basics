package day19.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class _02_TestNGAnnotations {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //1. "none" - Verify title of the google.com page is "Google

        //2. "testName" - Verify header "Automation with Selenium" is displayed on homepage

        //3. "description" - Verify "Enter message" section on Inputs page displaying expected txt

        //4. "enable/disable" - Verify Notes page header "Curriculum" displayed

        //ClassTask 1
    }


}
