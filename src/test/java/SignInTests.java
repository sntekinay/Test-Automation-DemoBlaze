import Base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTests extends BaseTest {

    @Test(description = "Yeni kullanıcı kaydı başarılı.")
    public void SignInSuccessfull() throws InterruptedException {

        webDriver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        String uniqueUsername = "senanur" + System.currentTimeMillis();
        webDriver.findElement(By.id("sign-username")).sendKeys(uniqueUsername);
        webDriver.findElement(By.id("sign-password")).sendKeys("senasena");
        webDriver.findElement(By.cssSelector("button[onclick='register()']")).click();
        Thread.sleep(2000);

        Alert alert = webDriver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Uyarı mesajı: " + alertText);

        Assert.assertEquals(alertText, "Sign up successful.", "Kayıt sonrası mesaj hatalı!");
        alert.accept();
    }
    @Test(description = "Daha önce kayıtlı kullanıcı adıyla tekrar kayıt olunması" )
    public void signUPWithExistingUser() throws InterruptedException{

        webDriver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        String existingUsername = "senanur";
        String password = "senasena";
        webDriver.findElement(By.id("sign-username")).sendKeys(existingUsername);
        webDriver.findElement(By.id("sign-password")).sendKeys(password);
        webDriver.findElement(By.cssSelector("button[onclick='register()']")).click();
        Thread.sleep(2000);

        Alert alert = webDriver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Uyarı mesajı:" + alertText);

        Assert.assertEquals(alertText, "This user already exist.", "Alert mesajı beklenenle eşleşmiyor: " + alertText);
        alert.accept();

    }
}
