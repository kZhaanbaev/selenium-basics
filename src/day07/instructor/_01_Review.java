package day07.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Review {
    /**
     * basic selectors
     * css selectors:
     * 		id
     * 		class
     * 		tag + id
     * 		tag + class
     *      tag + attribute
     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.findElement(By.cssSelector("#idValue")).click();
        driver.findElement(By.cssSelector(".classValue")).click();
        driver.findElement(By.cssSelector("button[id='idValue']")).click();
        driver.findElement(By.cssSelector("button[class='classValue']")).click();
        driver.findElement(By.cssSelector("button[name='attrValue']")).click();

        //we can omit tag name and use asterisk if we don't care about what tag name is
        driver.findElement(By.cssSelector("*[class='value']"));


    }
}
