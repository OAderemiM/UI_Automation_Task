package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.setUps;

public class LoginPage extends setUps {

        public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    //Using By as a location to identify the login fields
    private By username = By.id("txtUsername");
    private By password = By.id("txtPassword");
    private By signin = By.id("btnSignIn");
    private By companyLogo = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/nav/a/img");
    private By forgotPassword = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/div[2]/div[2]/a");

    public void verifyCompanyLogo(){
        //Find the company logo element and verify
     driver.findElement(companyLogo).isDisplayed();
    }
    public void verifyForgotPassword(){
        //Find the forgot password elements
        driver.findElement(forgotPassword).isDisplayed();
    }
    public void enterUsername (String uName){
        //Find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }
    public void enterPassword (String pwd){
        //Find the password element and enter the password
        driver.findElement(password).sendKeys(pwd);
    }
    public DashboardPage clickSignInButton(){
        //Find the username element and enter the username
        driver.findElement(signin).click();
        return new DashboardPage(driver);
    }
}
