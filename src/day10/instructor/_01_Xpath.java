package day10.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //immediate children
        //div[@class='value']/a
        //div[@class='value]/child::a


        //all following webElements regardless the hierarchy, by giving the starting point
        //div[@class='value']//a
        //div[@class='value]/following::a

        //all preceding webElements regardless the hierarchy, by giving the starting point
        //div[@class='value']//a
        //div[@class='value]/preceding::a

        //preceding-sibling
        //following-sibling
        //div[@id='porsche']/div/div[1]/div[4]/following-sibling::div
        //*[text()='Files']/preceding-sibling::a

        //parent
        //tag[@attr='value']/parent::tag
        //div[text()='Mercedes C-Class']/parent::div/div[@class='vehicle-type']

        //ancestor
        //tag[@attr='value']/ancestor::tag
        //div[text()='Mercedes C-Class']/ancestor::div[@id='mercedes']


        //descendant
        //tag[@attr='value']/descendant::tag



        driver.get("http://automation.techleadacademy.io/#/selectors");
//        List<WebElement> names = driver.findElements(By.xpath("(//div[text()='Porsche Macan'])[1]/preceding::div[@name]"));
//        names.forEach(each -> System.out.println(each.getText()));

        System.out.println(driver.findElement(By.xpath("(//div[text()='Sub-child 1'])[1]/ancestor::div[@id='ancestor']/div")).getText());


        driver.close();



    }
}
