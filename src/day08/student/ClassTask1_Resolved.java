package day08.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassTask1_Resolved {
    /**
     * Print out vehicle types only under Porsche section.
     * Note: text will print out vehicle types and also all vehicle models just because models are located
     * under the vehicle types by the hierarchy.
     * But result should contain only 4 elements in the List.
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/selectors");

        List<WebElement> list = driver.findElements(By.cssSelector("#porsche > .vehicle-types > div"));
        System.out.println(list.size());
        list.forEach(each -> System.out.println(each.getText()));

        driver.close();
    }
}
