package day19.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class _01_TDD {
    //Test Driven Development

    public int getCountOfChar(String txt, String inputChar){
        String[] arr = txt.split("");

        int count = 0;

        for(String each: arr){
            if (each.equalsIgnoreCase(inputChar))
                count++;
        }

        return count;
    }

    /**
     * write a test case(s) first and then create functionality
     */

    @Test
    public void test1(){
        _01_TDD obj = new _01_TDD();

        String testData = "Tech Lead Academy";
        String inputChar = "a";
        int expectedCount = 3;
        int actualCount = obj.getCountOfChar(testData, inputChar);

        Assert.assertEquals(actualCount, expectedCount);
    }





//    @Test
//    public void test1(){
//        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        driver.get("https://google.com");
//        assertEquals(driver.getTitle(), "Google");
//
//        driver.close();
//    }
}
