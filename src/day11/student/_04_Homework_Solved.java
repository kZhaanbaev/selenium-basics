package day11.student;

public class _04_Homework_Solved {
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

         System.setProperty("webdriver.chrome.driver","C:\\Users\\mder\\OneDrive\\Documents\\Selenium\\Drivers\\chromedriver_win32_updated\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    driver.get("http://automation.techleadacademy.io/#/alert");

        driver.findElement(By.xpath("//button[@id='generate-password']")).click();
        Thread.sleep(2000);

    Alert alert1 = driver.switchTo().alert();
        alert1.sendKeys("8");
        alert1.accept();
        Thread.sleep(2000);

    Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        Thread.sleep(2000);

    Alert alert3 = driver.switchTo().alert();
        alert3.accept();
        Thread.sleep(2000);

    Alert alert4 = driver.switchTo().alert();
        alert4.dismiss();
        Thread.sleep(2000);

    Alert alert5 = driver.switchTo().alert();
        alert5.accept();
        Thread.sleep(2000);

    Alert alert6 = driver.switchTo().alert();
        System.out.println(alert6.getText());
        alert6.accept();
        Thread.sleep(2000);

    String password = driver.findElement(By.xpath("//div[@id='log']")).getText();
        System.out.println("Password that has been generated is: "+password);

        driver.close();
}
}
