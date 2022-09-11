package day15.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class _04_RobotClass {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/files");

        Robot robot = new Robot();
        Actions actions = new Actions(driver);

        StringSelection path = new StringSelection("C:\\Users\\jakyp\\Desktop\\test.txt");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

        WebElement element = driver.findElement(By.id("exampleFormControlFile1"));

        actions.moveToElement(element).click().perform();
        Thread.sleep(2000);

        //Mac OS -------
        macCommands(robot);

        //Windows ------
        //windowsCommands(robot);

        Thread.sleep(3000);
        driver.close();
    }

    public static void macCommands(Robot robot){
        //Press Command + Shift + G to open file search input field
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);

        //Release pressed keyboard buttons
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);

        //Press Command + V
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);

        //Release Command + V
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);

        //Press and Release Enter button
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void windowsCommands(Robot robot){
        //Press Command + V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        //Release Command + V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        //Press and Release Enter button
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
