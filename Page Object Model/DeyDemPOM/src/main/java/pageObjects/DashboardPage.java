package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
    public DashboardPage(WebDriver driver) {
    this.driver = driver;
    }
    private WebDriver driver;
    //Using By to locate dashboardPage elements
    private By welcome = By.id("welcome");
    private By logoutButton = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/div/div/a[3]/p");

    //Confirm the dashboard URL
    public String getDashboardPageUrl() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        //wait until URL is visible

        wait.until(ExpectedConditions.urlToBe("https://dev.d2rxvhrryr2bkn.amplifyapp.com/app/feed"));
        return driver.getCurrentUrl();
    }
    public void clickWelcome() throws InterruptedException{
        Thread.sleep(10000);
        //Find the welcome element and click on the welcome button
        driver.findElement(welcome).click();
    }
    public LoginPage clickLogout()throws InterruptedException{
        Thread.sleep(3000);
        //Find the logout element and click on the logout button
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }
}
