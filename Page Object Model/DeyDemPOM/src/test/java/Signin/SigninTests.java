package Signin;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setUp.setUps;

public class SigninTests extends setUps {

    @Test(priority = 0)
    public void testACompanyLogo(){
        signinPage.verifyCompanyLogo();
    }

    @Test(priority = 0)
    public void testAForgotPassword(){

        signinPage.verifyForgotPassword();

    }
    @Test (priority = 1)
    public void testAPageTitle() throws InterruptedException{
        signinPage.enterUsername("Testng");
        signinPage.enterPassword("junior123");
        DashboardPage dashboardPage = signinPage.clickSignInButton();
        //Check whether the pageTitle is correct
        String pageTitle = "Deydem";
        if (pageTitle.equalsIgnoreCase("Deydem")){
            System.out.println("The page title is"+ pageTitle);
        } else{
            System.out.println("The page title is incorrect. Actual page is" +pageTitle);
        }
        Thread.sleep(5000);
    }



}
