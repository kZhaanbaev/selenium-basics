package day13.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_ClassTask_Solved {
    /**
     * 	Print out age + emails if age of the person is between 40 and 50 (from all 10 pages)
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/tables");

        List<WebElement> pages = driver.findElements(By.xpath("//li[@class='page-item']/a "));

        int total = 0;

        for(WebElement eachPage: pages){
            List<WebElement> customers = driver.findElements(By.xpath("//tbody/tr"));

            for(WebElement eachCustomer: customers){
                int age = Integer.parseInt(eachCustomer.findElement(By.xpath("./td[4]")).getText());
                String email = eachCustomer.findElement(By.xpath("./td[6]")).getText();

                if(age >= 40 && age <= 50){
                    System.out.println(age + " : " + email);
                    total++;
                }
            }
            eachPage.click();
        }

        System.out.println("===== " + total);

        driver.close();
    }
}
