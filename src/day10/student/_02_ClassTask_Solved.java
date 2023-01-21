package day10.student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_ClassTask_Solved {
    /**
     * Note: Use only xpath locators
     *  1. Open https://interview-prep-test.herokuapp.com/
     *  2. Login using following credentials:
     *      username: test@yahoo.com
     *      password: user123
     *  3. Add a statement under Dont's section
     *  4. Verify your new statement was added
     *  5. Delete newly added statement
     *  6. Verify it was deleted
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1. Go to URL
        driver.get("https://interview-prep-test.herokuapp.com/");

        //2. Login
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@yahoo.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        Thread.sleep(3000);

        //3. Add a statement under Dont's section
        driver.findElement(By.xpath("//div[@class='col-md-3 dont']/button")).click();
        driver.findElement(By.xpath("//textarea[@id='inputArea2']")).sendKeys("Try your Best -M");

        //3.1 click enter button
        driver.findElement(By.xpath("//button[@class='btn btn-outline-white btn-sm btn-success']")).click();

        Thread.sleep(3000);

        //4. Verify your new statement was added
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='anyClass']/div"));
        for (int i = list.size() - 1; i > 0; i--) {
        }
        System.out.println(list.get(list.size() - 1).getText());

        //5. Delete newly added statement
//        driver.findElement(By.xpath("(//button[@class='btn btn-outline-danger ml-1'])[3]")).click();

        Thread.sleep(3000);

        //6. Verify it was deleted

        String input = driver.findElement(By.xpath("//*[text()='Try your Best -M']")).getText();

        if (input.equals("Try your Best -M")) {
            System.out.println("FAIL: input was not deleted");
        } else {
            System.out.println("PASS: word is deleted");
        }

        driver.close();
    }



        driver.close();
    }
}
