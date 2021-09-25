package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpTest {

    // Import Driver
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        //Import chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //input the webpage URL
        driver.get("https://test.chaka.ng/");

        // Wait for 5 seconds
        Thread.sleep( 5000);

        //Maximize the window
        driver.manage().window().maximize();
    }
            @Test(priority = 2)
            public void printTile(){
        System.out.println(driver.getTitle());
    }
    //wait till page is fully loaded
            @Test(priority = 1)
            public void SignUpTest() throws InterruptedException {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(By.xpath("//*[@id=\"header\"]/nav/ul/li[2]/a")).click();
                driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/form/div[1]/label/input")).sendKeys("koolmicx2012@yahoo.com");
                driver.findElement(By.name("password")).sendKeys("ABCdef1234");
                driver.findElement(By.name("confirm-password")).sendKeys("ABCdef1234");
                driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/form/div[5]/div[1]/button")).click();
                Thread.sleep(10000);
            }
            public static void main (String args[]) throws InterruptedException{
        SignUpTest test = new SignUpTest();
        test.setUp();
    }
    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}

