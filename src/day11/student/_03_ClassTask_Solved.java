package day11.student;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_ClassTask_Solved {
    /**
     * Alerts (instructions in README file)
     * https://www.hyrtutorials.com/p/alertsdemo.html
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        //1.
        driver.findElement(By.id("alertBox")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();

        //2
        driver.findElement(By.id("confirmBox")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        System.out.println(driver.findElement(By.id("output")).getText()
                .equals("You pressed OK in confirmation popup"));

        //3
        driver.findElement(By.id("promptBox")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Kuba");
        alert3.accept();
        System.out.println(driver.findElement(By.id("output")).getText().contains("Kuba"));


        Thread.sleep(3000);
        driver.close();
    }
}
