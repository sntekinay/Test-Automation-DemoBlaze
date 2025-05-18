package Base;

import Pages.LogInPage;
import Pages.SignInPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary{
    //public static LogInPage logInPage =new LogInPage();
    //public static SignInPage signInPage = new SignInPage();

    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.demoblaze.com/");
    }

    @AfterMethod
    public void closeBrowser(){
        webDriver.quit();

    }
}
