package day04.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_BasicInteractions {
    public static void main(String[] args) {
        /**
         * 1. Open google page
         * 2. Input "selenium" keyword in searchbar
         * 3. Click Search button
         * 4. Get value of href attribute of Wikipedia linkText of search result mini window
         *  4.1 Verify expected vs actual
         * 5. Print out header of the first item from the search result
         *  5.1 Verify if word contains a word "selenium"
         * 6. Verify if button "Shopping" is there. (is enabled)
         * 7. Verify if google logo on top left of the page is displayed
         */

        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        //1.
        driver.get("https://google.com");

        //2. How to INPUT a text in input fields?
        driver.findElement(By.name("q")).sendKeys("selenium");

        //3. How to CLICK on a button?
        driver.findElement(By.name("btnK")).click();

        //4. How to get value of any attribute of the element?
        String href = driver.findElement(By.linkText("Wikipedia")).getAttribute("href");
        System.out.println(href);

        //4.1 Verify expected vs actual
        String expectedHref = "https://en.wikipedia.org/wiki/Selenium";
        if (href.equals(expectedHref)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        //5. Print out header of the first item from the search result
        String result = driver.findElement(By.tagName("h3")).getText();
        System.out.println(result);

        //5.1 Verify if word contains a word "selenium"
        String expectedWord = "selenium";
        if(result.toLowerCase().contains(expectedWord)){
            System.out.println("PASS");
        }else {
            System.out.println("Search result doesn't contain the expected word " + expectedWord);
        }

        //6. Verify if button "Shopping" is there. (is enabled)
        System.out.println(driver.findElement(By.linkText("Shopping")).isEnabled());

        //7. Verify if google logo on top left of the page is displayed
        if(driver.findElement(By.id("logo")).isDisplayed()){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }


        driver.close();
    }
}
