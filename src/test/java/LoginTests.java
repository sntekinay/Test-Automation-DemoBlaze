import Base.BaseTest;
import Pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    LogInPage logInPage =new LogInPage();

    @Test(description = "Başarılı kullanıcı girişi ")
    public void loginSuccessful() throws InterruptedException {
        logInPage.clickLogIn()
                .fillUsername()
                .fillPassword()
                .clickLogInInside();
        String welcomeText = getWelcomeText();
        screenshot();
        Assert.assertEquals(welcomeText, welcomeTextMsg);

    }

    @Test(description = "Başarısız kullanıcı girişi- şifre yanlış")
    public void loginUnsuccesful() throws InterruptedException{
        logInPage.clickLogIn()
                .fillUsername()
                .fillWrongPassword()
                .clickLogInInside();

        String alertText = getAndAcceptAlertText();
        screenshot();
        Assert.assertEquals(alertText, wrongPassMsg);

    }

    @Test(description = "Başarısız kullanıcı girişi - user does not exist")
    public void LoginUserDoesNotExist() throws InterruptedException{
        logInPage.clickLogIn()
                .fillNotExistUsername()
                .fillPassword()
                .clickLogInInside();

        String alertText = getAndAcceptAlertText();
        screenshot();
        Assert.assertEquals(alertText, notExistUserMsg);
    }
}
