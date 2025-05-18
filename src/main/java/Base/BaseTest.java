package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static WebDriver webDriver ;

    @BeforeMethod
    public void openBrowser(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.demoblaze.com/");
    }

    @AfterMethod
    public void closeBrowser(){
        webDriver.quit();

    }

}
