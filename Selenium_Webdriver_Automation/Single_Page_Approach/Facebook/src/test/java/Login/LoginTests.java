package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //Import driver
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        //Import chromedriver

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //Input the webpage URL
        driver.get("https://www.facebook.com/login");

        //wait for 5 seconds
        Thread.sleep(5000);

        //maximize the window
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        //wait till the page is fully loaded
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement (By.id ("email")).sendKeys("obiaderemimichael@gmail.com");
        driver.findElement( By.id ("pass")).sendKeys("admin1234");
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 0)
    public void testSuccessfulLogin(){
        if (driver.getCurrentUrl ().contains("https://www.facebook.com/login/feed"))
            //pass
            System.out.println("The Page URL contains /app/feed");

        else
            //Fail
            System.out.println("The Page URL does not contain /app/feed");
    }
    @Test(priority = 0)
    public void testLogout() throws InterruptedException {
        //click on the profile button
        driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/a/div[1]/div[2]/div/div/div/div[2]/span")).click();
        Thread.sleep(2000);
        //click on the logout button
        driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).click();
        //printout response based on status
        if(driver.getCurrentUrl().contains ("https://www.facebook.com/login/feed/app"))
            //pass
            System.out.println("The Login page URL contains /login");
        else
            //Fail
            System.out.println("The login URL does not contain/login");
    }

    @Test(priority = 1)
    public void testNegativeLogin(){
        driver.findElement(By.id ("email")).sendKeys("Wrong");
        driver.findElement(By.id ("pass")).sendKeys("junior123");
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        String expectedErrorMessage = "The password that you've entered is incorrect. Forgotten password?";
        String actualErrorMessage = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[1]/div[2]")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }


    public static void main (String args[]) throws InterruptedException {
        LoginTests test = new LoginTests ();
        test.setUp();
    }

    @AfterTest
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(10000);
        driver.quit();
    }
}
