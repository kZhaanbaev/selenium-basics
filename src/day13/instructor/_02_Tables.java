package day13.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_Tables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/tables");

        //Print out all emails
        List<WebElement> emails = driver.findElements(By.xpath("//tr/td[6]"));
        emails.forEach(a -> System.out.println(a.getText()));

        //Print out all first names
        List<WebElement> names = driver.findElements(By.xpath("//tr/td[1]"));
        names.forEach(a -> System.out.println(a.getText()));

        //Print out all first names with emails
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i).getText() + " : " + emails.get(i).getText());
        }

        //Print out all first names with emails but as groups, retrieve data separately from each row.
        List<WebElement> customers = driver.findElements(By.xpath("//tbody/tr"));

        for(WebElement eachCustomer: customers){
            System.out.println(eachCustomer.findElement(By.xpath("./td[1]")).getText()
            + " : " + eachCustomer.findElement(By.xpath("./td[6]")).getText());
        }


        //Task: Print out value of First names based on if gender is Male (in Tables page)
        for(WebElement eachCustomer: customers){
            if(eachCustomer.findElement(By.xpath("//td[3]")).getText().equals("Male"))
                System.out.println(
                        eachCustomer.findElement(By.xpath("./td[1]")).getText()
                );
        }


        driver.close();


        //Class Task 1
    }
}
