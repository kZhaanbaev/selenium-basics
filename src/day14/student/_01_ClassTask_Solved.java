package day14.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_ClassTask_Solved {
    /**
     * 		a. Open practice website -> iframes section
     * 		b. In Budget Tracker website:
     * 			i. add one transaction
     * 				your name + some numbers
     * 			ii. capture Total Amount
     * 		c. In Shared Note website input captured data
     * 			a. Title - your name
     * 			b. Note section:
     * 				1. Transaction - Amount
     * 			c. Click save
     * 			d. Find newly entered note in left column and click on it
     *          e. Verify if Title on right section is your name and print out the text
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //a
        driver.get("http://automation.techleadacademy.io/#/iframes");

        //b
        driver.switchTo().frame("parent-iframe");
        driver.switchTo().frame("budget-tracker");

        driver.findElement(By.id("t-name")).sendKeys("Kuba");
        driver.findElement(By.id("t-amount")).sendKeys("5555");
        driver.findElement(By.id("add-btn")).click();

        String total = driver.findElement(By.id("total")).getText();

        //c
        driver.switchTo().defaultContent();
        driver.switchTo().frame("note");

        String expectedName = "Kuba";
        driver.findElement(By.className("note-title")).sendKeys(expectedName);
        driver.findElement(By.className("note-textarea")).sendKeys(total);
        driver.findElement(By.xpath("//i[contains(@class, 'save-note')]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//*[text()='Kuba'])[last()]")).click();

        Thread.sleep(3000);
        String actualName = driver.findElement(By.className("note-title")).getAttribute("value");


        if (expectedName.equals(actualName)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        System.out.println(driver.findElement(By.className("note-textarea")).getAttribute("value"));


        //driver.close();
    }
}
