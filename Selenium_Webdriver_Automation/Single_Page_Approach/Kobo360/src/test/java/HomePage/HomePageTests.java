package HomePage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

public class HomePageTests {
    //Import the selenium webDriver
    private WebDriver driver;
    //Import chromeDriver


    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromeDriver.exe");
        driver = new ChromeDriver();
        //Input the project URL = kobo360 URL
        driver.get ("https://www.kobo360.com/NG/en/");
        //wait for globally
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Maximize the window
        driver.manage().window().maximize();
        //get page title
            System.out.println(driver.getTitle());
            //click on KOBOCARE
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/ul/a[5]")).click();
    }
        //initiate the test run command
        public static void main(String args[]){
        HomePageTests test = new HomePageTests();
        test.setUp();
    }
    //close the browser after test
    public void quitBrowser(){
        driver.quit();
    }
    }




