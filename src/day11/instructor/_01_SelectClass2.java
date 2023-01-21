package day11.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _01_SelectClass2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectclass");

        //select multiple options
        //This can happen if developer enabled multi select option
        //In "Multi-select" section, select 3 IT Roles, all roles will be highlighted in the end
        Select select = new Select(driver.findElement(By.id("cars")));
        select.selectByIndex(2);
        select.selectByVisibleText("Devops");
        select.selectByValue("Director");

        //check if selecting multiple options is enabled
        System.out.println(select.isMultiple());

        //if multi select was not enabled then it would return false as following
        Select select2 = new Select(driver.findElement(By.name("select2")));
        System.out.println(select2.isMultiple());


        //deselect by text
        select.deselectByVisibleText("Yellow");

        //deselect by index
        select.deselectByIndex(2);

        //deselect by value
        select.deselectByValue("value");

        //deselect all selected options
        select.deselectAll();

        //NOTE: ClassTask2

        Thread.sleep(3000);
        driver.close();
    }
}
