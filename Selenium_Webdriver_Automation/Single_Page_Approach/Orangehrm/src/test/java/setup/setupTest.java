package setup;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import setUp.setUps;

public class setupTest extends setUps {

    public setupTest (WebDriver driver){
            }

    @Test (priority = 0)
    public void testSetUp (){
        String pageURL = "https://opensource-demo.orangehrmlive.com";
        if(pageURL.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com")){
            System.out.println("The webpage URL is "+pageURL);
        } else {
            System.out.println("Invalid URL. Actual webpage is "+pageURL);
        }
    }

}
