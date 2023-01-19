package day10.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //immediate children

        /**
         * div[@class='value']/a
         * //div[@id='parent1']/div
         *
         * div[@class='value]/child::a
         * //div[@id='parent1']/child::div
         */

        //descendant

        /**
         * //div[@class='value']//a -> locates all elements that are under the targeted element by hierarchy
         * //div[@id='parent1']//div
         *
         * //tag[@attr='value']/descendant::tag
         * //div[@id='parent1']/descendant::div
         */


        //following -> all following webElements regardless the hierarchy, by giving the starting point

        /**
         *
         * //div[@id='parent1']//div -> locates only 4 elements since parent1 has only 4 div inside of itself
         *
         * //div[@class='value]/following::a -> sets the starting point but locates all elements
         * that come below this element in DOM
         *  //div[@id='parent1']/following::div
         */


        //preceding -> all preceding webElements regardless the hierarchy, by giving the starting point

        /**
         * //div[@class='value]/preceding::a
         * sets a starting point just like 'following' and located all elements that come before target element
         * in the whole DOM
         * //div[@id='parent1']/preceding::div
         */


        //preceding-sibling

        /**
         * //div[@class='value]/following-sibling::a -> locates all elements below the target element in
         * html document but only at the same level, under the same parent element
         * //div[@id='parent1']/following::div -> gives only 1 result
         *
         * Task: Locate both elements under 'Mercedes GLA-Class' using following-sibling option
         * Solution: //div[@name='gla-class']/following-sibling::div
         */

        //following-sibling

         /**
         * //div[@class='value]/preceding-sibling::a -> locates all elements above the target element in
         * html document but only at the same level, under the same parent element
         * //div[@id='parent1']/preceding::div -> gives only 1 result
         *
         * Task: Locate all 3 vehicle names above 'Porsche GT4' using preceding-sibling option
         * Solution: //div[text()='Porsche GT4']/preceding-sibling::div
         * Note: it will include vehicle type name as well since it's on the same level as others.
         */


        //parent

        //tag[@attr='value']/parent::tag
        //div[text()='Mercedes C-Class']/parent::div/div[@class='vehicle-type']

        //ancestor
        //tag[@attr='value']/ancestor::tag
        //div[text()='Mercedes C-Class']/ancestor::div[@id='mercedes']


        driver.close();

        //NOTE: ClassTask2

    }
}
