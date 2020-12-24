package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class setUps {
    //Create login Object
    protected LoginPage loginPage;

    //Create a webDriver Object
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        //Importation of the chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //Instantiate a webdriver object
        driver = new ChromeDriver();

        //Maximize window size
        driver.manage().window().maximize();

        //Launch the application URL and wait
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Instantiate Login page after lunching the browser...handle
        loginPage = new LoginPage(driver);

    }
    /* @AfterTest
    public void cleanUp(){
        driver.manage().deleteAllCookies ();
    }*/

    @AfterClass
    public void quitBrowser(){
        driver.quit();
    }
}
