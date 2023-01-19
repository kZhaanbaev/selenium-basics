package day10.instructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Xpath {
    //NOTE: solve ClassTask2 from previous day

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

        /**
         * //div[text()='bird'][1]
         *
         * Note: index starts with 1 not 0
         * Exapmle: locating Alert nav button by index
         * //nav[1]/a[7]
         *
         * Example: locating E-commerce link on homepage
         * //div[@class='home-page']/a[4]
         *
         * TASK: Locate 1st direct child of parent1 only
         *
         */


        //keywords: last(), last()-n

        /**
         * //tag[@attr='value']/tag[last()]
         *
         * Example: locating last link 'Shopping Cart' using last() keyword
         *  //div[@class='home-page']/a[last()]
         *  or
         *  //div[@class='home-page']/a[2]
         *
         * Example: locating link 'Mercury tours' using last()-n keyword
         * //div[@class='home-page']/a[last()-5]
         *
         * TASK: Locate last direct child of parent1 only using last() keyword
         */


        //and, or keywords in xpath

        /**
         * //tag[@attr1='value1' or @attr2='value2]
         *
         * Example: locate cars that contains text Class or Cayenne
         * //div[contains(text(), 'Class') or contains(text(), 'Cayenne')]
         *
         * //tag[@attr1='value1' and @attr2='value2]
         *
         * Example: locate cars that contains text Mercedes and Class
         * //div[contains(text(), 'Class') and contains(text(), 'Mercedes')]
         */


        driver.close();

        //NOTE: ClassTask1
    }
}
