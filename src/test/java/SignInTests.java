import Base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTests extends BaseTest {

    @Test(description = "Yeni kullanıcı kaydı başarılı.")
    public void SignInSuccessfull() throws InterruptedException {

        signInPage.clickSignIn()
                .fillUniqueUsername()
                .fillPassword()
                .clickRegister();
        String alertText = getAndAcceptAlertText();
        Assert.assertEquals(alertText,signInSuccessfulMsg);
    }

    @Test(description = "Daha önce kayıtlı kullanıcı adıyla tekrar kayıt olunmaz." )
    public void signUPWithExistingUser() throws InterruptedException{

        signInPage.clickSignIn()
                .fillUsername()
                .fillPassword()
                .clickRegister();
        String alertText = getAndAcceptAlertText();
        Assert.assertEquals(alertText, existUsernameMsg);

    }
}
