package day14.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_iFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //access TLA website and print main text "Hello! I am the parent iFrame without switching

        //access parent iFrame and print text again with switching

        //access child iFrame - budget calc
        //  input Transaction name and amount

        //access child iFrame - wiki
        //  print listed languages

        //navigation from one iframe to another, child to parent, etc.

        //Class Task 1
    }
}
