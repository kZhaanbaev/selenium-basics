package day04.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework1_Solved {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/home");

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //inventory_item_name
        //inventory_item_price

        List<WebElement> names = driver.findElements(By.className("inventory_item_name"));
        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

//        for(WebElement each: names){
//            System.out.println(each.getText());
//        }

        names.forEach(each -> System.out.println(each.getText()));

//
//        for(WebElement each: prices){
//            System.out.println(each.getText());
//        }

        //printed out combined both lists
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i).getText() + " - " + prices.get(i).getText());
        }




        driver.close();
    }
}
