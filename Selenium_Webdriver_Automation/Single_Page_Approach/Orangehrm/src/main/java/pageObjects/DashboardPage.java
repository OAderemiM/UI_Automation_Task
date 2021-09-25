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
    private By logoutButton = By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");
    private By subscribeButton = By.id("Subscribe_link");
    private By companyBrand = By.xpath("//*[@id=\"branding\"]/a[1]/img");
    private By dashboardText = By.xpath("//*[@id=\"content\"]/div/div[1]/h1");


    public void clickWelcome() {
        //Find the welcome element and click on the welcome button
        driver.findElement(welcome).click();
    }

    public LoginPage clickLogout() {
        //Find the logout element and click on the logout button
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);

    }

    public SubscriberPage clickSubscribe() {
        driver.findElement(subscribeButton).click();
        return new SubscriberPage(driver);
    }

    public void verifyCompanyBrand() {
        //Find the Company Brand element and click on the Image button
        driver.findElement(companyBrand).isDisplayed();
    }
    public void verifyDashboardText() {
        //Find the Dashboard element and click on the Dashboard button
        driver.findElement(dashboardText).getText();
    }
}
