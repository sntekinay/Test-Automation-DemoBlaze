import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(description = "Başarılı kullanıcı girişi ")
    public void loginSuccessful() throws InterruptedException {
        logInPage.clickLogIn()
                .fillUsername()
                .fillPassword()
                .clickLogInInside();
        String welcomeText = getWelcomeText();
        Assert.assertEquals(welcomeText, welcomeTextMsg);
    }

    @Test(description = "Başarısız kullanıcı girişi- şifre yanlış")
    public void loginUnsuccesful() throws InterruptedException{
        logInPage.clickLogIn()
                .fillUsername()
                .fillWrongPassword()
                .clickLogInInside();
        String alertText = getAndAcceptAlertText();
        Assert.assertEquals(alertText, wrongPassMsg);
    }

    @Test(description = "Başarısız kullanıcı girişi - user does not exist")
    public void LoginUserDoesNotExist() throws InterruptedException{
        logInPage.clickLogIn()
                .fillNotExistUsername()
                .fillPassword()
                .clickLogInInside();
        String alertText = getAndAcceptAlertText();
        Assert.assertEquals(alertText, notExistUserMsg);
    }
}
