package day19.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _03_TestNGAnnotations {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //5. "priority"

        //6. "invocationCount" - Verify alert is getting displayed within 10 seconds on Synchronization page
        //          using WebDriverWait

        //7. "invocationTimeOut" - Verify input text is getting displayed within 10 seconds on Synchronization page,
        //          substitute WebDriverWait (applies to all counts together as a whole)

        //8. "timeOut" - Verify input text is getting displayed within 10 seconds on Synchronization page,
        //         substitute WebDriverWait (applies to specific test case, no count needed)

        //9. "dataProvider" - Verify all 18 navigation buttons are working as expected by taking to correct pages

        //ClassTask 2

    }

}
