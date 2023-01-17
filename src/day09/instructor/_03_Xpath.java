package day09.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //parent -> child
        //css ->    div[class='value']>div[alt='value'] -> immediate children
        //xpath ->  //div[@class='value']/div[@alt='value'] -> immediate children
        //Locating both direct children of parent1 only


        //parent -> all children
        //css ->    div[class='value'] div[alt='value'] -> any webElement under parent hierarchy
        //xpath ->  //div[@class='value']//div[@alt='value'] -> any webElement under parent hierarchy
        //Locating all children of parent1 only


        //indexes [n]
        //div[text()='bird'][1]
        //nav[1]/a[7]
        //div[@class='home-page']/a[4]
        //Note: index starts with 1 not 0
        //Locating 1st direct child of parent1 only


        //keywords: last(), last()-n
        //div[@class='home-page']/a[last()]
        //div[@class='home-page']/a[last()-5]
        //(//div[@class='text']/a[last()])[1]
        //Locating last direct children of parent1 only


        //and, or keywords in xpath
        //locate cars that contains text Class or Cayenne
        //locate cars that contains text Mercedes and Class
    }
}
