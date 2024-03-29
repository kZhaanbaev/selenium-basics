package day11.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_SelectClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

        //when to use Select class?
        /**
         * use Select class only when you see <select></select> tags on drop down menus
         */
        Select select = new Select(driver.findElement(By.name("select1")));

        //select by text
        select.selectByVisibleText("Three");

        //select by index
        select.selectByIndex(6);

        //select by value
        select.selectByValue("Nine");

        //how to get all selectable options?
        List<WebElement> allOptions = select.getOptions();
        allOptions.forEach(each -> System.out.println(each.getText()));

        //NOTE: ClassTask 1 - 10min


        Thread.sleep(3000);
        driver.close();

    }
}
