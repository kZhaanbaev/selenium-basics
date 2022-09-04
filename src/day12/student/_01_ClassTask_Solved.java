package day12.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_ClassTask_Solved {
    /**
     *  URL: http://automation.techleadacademy.io/#/popup
     *  1. Click on "BMI Calculator" button
     *  2. Input height and weight
     *  3. Click on "Calculate" button
     *  4. Print out BMI Result
     *  5. Print out which category it belongs to
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/popup");

        //1
        driver.findElement(By.id("bmi_btn")).click();
        Thread.sleep(1000);

        //2
        driver.findElement(By.name("feet")).sendKeys("6");
        driver.findElement(By.name("inch")).sendKeys("0");
        driver.findElement(By.name("weight")).sendKeys("200");

        //3
        driver.findElement(By.id("calculate_btn")).click();

        //4, 5
        double bmi = Double.parseDouble(driver.findElement(By.id("BMI_result")).getText());
        System.out.println(bmi);

        if (bmi >= 30) {
            System.out.println("obese");
        } else if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("overweight");
        }
    }
}
