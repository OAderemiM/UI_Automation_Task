package setup;

import org.testng.annotations.Test;
import setUp.setUps;

public class setupTests extends setUps {

    @Test(priority = 0)
    public void testSetUp (){
        String pageURL = "https://dev.d2rxvhrryr2bkn.amplifyapp.com/login";
        if (pageURL.equalsIgnoreCase("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login")){
            System.out.println("The webpage URL is" + pageURL);
        }else{
            System.out.println("Invalid URL. Actual webpage URL is"+ pageURL);
        }
    }
}
