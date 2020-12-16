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
        driver.get("https://monosnap.com/");

        //wait for 5 seconds
        Thread.sleep(5000);

        //maximize the window
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        //wait till the page is fully loaded
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//span [contains(text(),'Sign In')]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[1]"));
        driver.findElement (By.id ("Email")).sendKeys("koolmicx2012@yahoo.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[2]"));
        driver.findElement( By.id ("Password")).sendKeys("06junior@01");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
        Thread.sleep(1000);
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
