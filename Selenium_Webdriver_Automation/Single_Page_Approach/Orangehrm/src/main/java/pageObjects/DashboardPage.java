package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    //Using By to locate dashboardPage elements
    private By welcome = By.id("welcome");
    private By logoutButton = By.linkText("logout");
    private By subscribeButton = By.id("Subscribe_link");


    public void clickWelcome (){
        //Find the welcome element and click on the welcome button
        driver.findElement(welcome).click();
    }

    public LoginPage clickLogout(){
        //Find the logout element and click on the logout button
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);

    }

    public SubscriberPage clickSubscribe(){
        driver.findElement (subscribeButton).click();
        return new SubscriberPage (driver);
    }
}

