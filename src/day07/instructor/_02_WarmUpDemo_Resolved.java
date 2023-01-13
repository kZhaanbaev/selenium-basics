package day07.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_WarmUpDemo_Resolved {
    /**
     * day05.ClassTask2
     *  Inputs page
     * 1. Create an array of String with test data
     * 2. Capture all input elements using common locator
     * 3. Input test data above using loop
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String[] data = {"John", "Smith", "j.smith@test.com", "222-222-2222", "Address", "NYC", "New York", "12345"};

        driver.get("http://automation.techleadacademy.io/#/inputs");

        List<WebElement> inputs = driver.findElements(By.cssSelector(".form-control"));

        for(int i = inputs.size()-1; i >= 3; i--){
            inputs.get(i).sendKeys(data[i-3]);
        }


        driver.close();

        //Note: ClassTask1 after demo
    }


}
