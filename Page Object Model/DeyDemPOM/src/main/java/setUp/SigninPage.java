package setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.DashboardPage;

public class SigninPage {
    public SigninPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    //Using By as a location to identify the signIn fields
    private By username = By.id("txtUsername");
    private By password = By.id("txtPassword");
    private By signIn = By.id("btnSignIn");
    private By companyLogo = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/nav/a/img");
    private By forgotPassword = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/div[2]/div[2]/a");
    private By Logout = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/div/div/a[3]/p");

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
        driver.findElement (By.id ("username")).sendKeys(uName);
    }
    public void enterPassword (String pwd){
        //Find the password element and enter the password
        driver.findElement(By.id("password")).sendKeys(pwd);
    }
    public DashboardPage clickSignInButton(){
        //Find the username element and enter the username
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();



        return new DashboardPage(driver);
    }
}


