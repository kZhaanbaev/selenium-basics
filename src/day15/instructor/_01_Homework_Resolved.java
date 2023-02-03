package day14.instructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class _01_Homework_Resolved {
    /**
     *  URL: http://automation.techleadacademy.io/#/multiplewindow
     *  1. Print out texts of each button on the page (Launch TLA, Launch Google, Launch Facebook)
     *  2. Click on "Launch Facebook"
     *  3. Print out text "Connect with friend and the world..."
     *  4. Close facebook window
     *  5. Return to the main window
     *  7. Click on "Launch Google" button
     *  8. Print out title of the page
     *  9. Click on "Launch TLA"
     *  10. Print out text of navigation buttons
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Desktop/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/multiplewindow");
        List<WebElement> btns = driver.findElements(By.xpath("//a[starts-with(@class, 'btn')]"));
        btns.forEach(button -> System.out.println(button.getText()));

        btns.get(2).click();

        String mainWindowID = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for(String each: allWindows){
            if(!each.equals(mainWindowID))
                driver.switchTo().window(each);
        }

        System.out.println(driver.findElement(By.tagName("h2")).getText());
        driver.close();
        
        driver.switchTo().window(mainWindowID);

        //clicking on google button
        btns.get(1).click();

        allWindows = driver.getWindowHandles();

        for(String each: allWindows){
            if(!each.equals(mainWindowID))
                driver.switchTo().window(each);
        }

        System.out.println(driver.getTitle());

        driver.switchTo().window(mainWindowID);

        btns.get(0).click();

        allWindows = driver.getWindowHandles();

        for(String each: allWindows){
            driver.switchTo().window(each);
            if(driver.getTitle().contains("Tech Lead Academy")){
                driver.manage().window().maximize();
                List<WebElement> navBtns = driver.findElements(By
                        .xpath("//div[@id='lp-pom-box-346']/div[contains(@class,'nlh')]"));
                navBtns.forEach(eachBtn -> System.out.println(eachBtn.getText()));
                break;
            }
        }


        Thread.sleep(3000);
        driver.quit();
    }
}
