package day08.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_CssLocators_axis {
    /**
     * Child Elements
     * 1. Direct-child
     * 2. Sub-child (anything under the parent. Child, grand-child etc. doesn't matter.)
     * 3. Nth-child
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automation.techleadacademy.io/#/selectors");
        //1. direct-child
        /**
         * tag[attr=value] > tag
         * tag[attr=value] > tag[attr=value]
         *
         * it's possible to add more hierarchy like below, but not recommended as it gets hard to read
         * button[class='classValue'] > div[img='classValue'] > button[class='classValue']
         *
         * Example: print out direct children of Parent 1 on Selectors page
         * following will print only 1st child due to using findElement() method.
         */

        System.out.println(driver.findElement(By.cssSelector("div#parent1 > div")).getText());

        /**
         * following will locate both direct children of parent 1.
         * Note: it will print sub-children texts as well just because they are under Child 2,
         * but located element is only Child 2, not sub-children.
         * To prove print out the size of the list which is 2 (only direct 2 child 1 and 2) not 4.
         */
        List<WebElement> parent1Children = driver.findElements(By.cssSelector("div#parent1 > div"));
        parent1Children.forEach(each -> System.out.println(each.getText()));

        System.out.println(parent1Children.size());

        //NOTE: ClassTask1

        //2. Sub-child (any child)
        /**
         * parent and child locators are separated by a "space"
         * tag[attr=value] tag
         * tag[attr=value] tag[attr=value]
         *
         * button[class='classValue'] button[class='classValue']
         *
         * Example: print out all children of Parent 1 this time.
         * Note: it will print exact same text as above example with direct children
         * but size of the list will be 4, direct children and sub-children will be located
         * as separate elements this time.
         */

        List<WebElement> parent1Children2 = driver.findElements(By.cssSelector("div#parent1 div"));
        parent1Children2.forEach(each -> System.out.println(each.getText()));

        System.out.println(parent1Children2.size());

        //NOTE: No task

        //Nth-children

        /**
         * to access first child --> tag[attr=value]:first-child
         * Example: locate Sub-child 1 of Child 3
         */
        System.out.println(driver.findElement(By.cssSelector("div#parent2-child3 > div:first-child")).getText());

        /**
         * to access last child --> tag[attr=value]:last-child
         * Example: locate Sub-child 5 (last) of Child 3
         */
        System.out.println(driver.findElement(By.cssSelector("div#parent2-child3 > div:last-child")).getText());

        /**
         * to access any child --> tag[attr=value]:nth-child(3)
         * count starts from 1, not from 0 like index.
         * Example: locate Sub-child 3 of Child 3
         */
        System.out.println(driver.findElement(By.cssSelector("div#parent2-child3 > div:nth-child(3)")).getText());

        //NOTE: ClassTask2


        driver.close();
    }
}
