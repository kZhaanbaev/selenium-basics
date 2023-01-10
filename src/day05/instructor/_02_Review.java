package day05.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Review {
    /**
     * 1. Open https://www.coolthings.com/
     * 2. Verify title of the page is "CoolThings.com | Cool Stuff, Cool Gadgets, Cool Gifts & Things".
     * 3. Verify each page has expected headers:
     *  page: Gadgets -> header: Gadgets, Gifts -> Cool Gifts, Gear -> Gear, Toys -> Toys
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        // 1. Open https://www.coolthings.com/
        driver.get("https://www.coolthings.com/");

        // 2. Verify title of the page is "CoolThings.com | Cool Stuff, Cool Gadgets, Cool Gifts & Things".
        if (driver.getTitle().equals("CoolThings.com | Cool Stuff, Cool Gadgets, Cool Gifts & Things")){
            System.out.println("PASS Title");
        }else {
            System.out.println("FAIL Title");
        }

        // 3. Verify each page has expected headers:
        //    page: Gadgets -> header: Gadgets, Gifts -> Cool Gifts, Gear -> Gear, Toys -> Toys
        //Option 1:
        driver.findElement(By.linkText("Gadgets")).click();
        WebElement header = driver.findElement(By.tagName("h1"));
        if (header.getText().equalsIgnoreCase("Gadgets")){
            System.out.println("PASS | Expected: Gadgets | Actual: " + header.getText());
        } else {
            System.out.println("FAIL | Expected: Gadgets | Actual: " + header.getText());
        }

        //Option 2:
        String[] navButtons = {"Gadgets", "Gifts", "Gear", "Toys"};

        for(String s: navButtons){
            driver.findElement(By.linkText(s.toUpperCase())).click();

            WebElement eachHeader = driver.findElement(By.tagName("h1"));

            if (header.getText().equalsIgnoreCase(s)){
                System.out.println("PASS | Expected: " + s + " | Actual: " + eachHeader.getText());
            } else {
                System.out.println("FAIL | Expected: " + s + " | Actual: " + eachHeader.getText());
            }
        }


        driver.close();

        //NOTE: ClassTask 1

    }
}
