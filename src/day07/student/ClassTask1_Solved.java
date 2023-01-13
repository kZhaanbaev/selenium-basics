package day07.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassTask1_Solved {
    /**
     * 	- Class Task:
     * 		○ 1. Navigate to "https://www.google.com/"
     * 		○ 2. Input "SDET positionS" in search bar
     * 		○ 3. Click on "Google search"
     * 		○ 4. Click on "100+ more jobs" option
     * 		○ 5. Print out names of companies that are hiring from the list
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        driver.findElement(By.cssSelector("input[name=q]")).sendKeys("SDET positions");

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name=btnK]")).click();

        driver.findElement(By.cssSelector("a.esVihe")).click();

        List<WebElement> companies = driver.findElements(By.cssSelector("div.vNEEBe"));

        companies.forEach(name -> System.out.println(name.getText()));

        driver.close();

    }


}
