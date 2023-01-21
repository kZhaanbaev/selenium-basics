package day10.student;

public class _01_ClassTask_Solved {
    /**
     * Note: Use only xpath locators
     *  1. Open https://interview-prep-test.herokuapp.com/
     *  2. Login using following credentials:
     *      username: test@yahoo.com
     *      password: user123
     *  3. Print out names of dashboards
     *  4. Print out all statements under Do's and Don't section
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/TLA/Selenium/B-7/libs/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://interview-prep-test.herokuapp.com/");

        //login
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@yahoo.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        //print dashboard names
        List<WebElement> dashboards = driver.findElements(By.xpath("//button[@type='submit']"));
        dashboards.forEach(each -> System.out.println(each.getText()));

        //print statements
        List<WebElement> statements = driver.findElements(By.xpath("//div[contains(@class, 'odd') or contains(@class, 'even')]"));
        statements.forEach(each -> System.out.println(each.getText()));

        driver.close();
    }
}
