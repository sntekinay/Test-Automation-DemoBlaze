import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    //LoginPage loginPage = new LoginPage();

    @Test(description = "Başarılı kullanıcı girişi ")
    public void loginSuccessful() throws InterruptedException {

        webDriver.findElement(By.id("login2")).click();
        Thread.sleep(2000);

        String username = "senanur";
        String corretpass = "senasena";
        webDriver.findElement(By.id("loginusername")).sendKeys(username);
        webDriver.findElement(By.id("loginpassword")).sendKeys(corretpass);
        webDriver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
        Thread.sleep(3000);

        String welcomeText = webDriver.findElement(By.id("nameofuser")).getText();
        System.out.println("Giriş sonrası görünen yazı: " + welcomeText);
        Assert.assertEquals(welcomeText, "Welcome " + username, "Login sonrası mesaj hatalı!");

    }
    @Test(description = "Başarısız kullanıcı girişi- şifre yanlış")
    public void loginUnsuccesful() throws InterruptedException{

        webDriver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        String username = "senanur";
        String wrongPassword = "wrongpass";
        webDriver.findElement(By.id("loginusername")).sendKeys(username);
        webDriver.findElement(By.id("loginpassword")).sendKeys(wrongPassword);
        webDriver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
        Thread.sleep(2000);

        Alert alert = webDriver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Uyarı mesajı (yanlış şifre): " + alertText);

        Assert.assertEquals(alertText, "Wrong password.", "Alert mesajı beklenenle eşleşmiyor: " + alertText);
        alert.accept();

    }
    @Test(description = "Başarısız kullanıcı girişi - user does not exist")
    public void LoginUserDoesNotExist() throws InterruptedException{
        webDriver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        String notExistUsername = "senanur" + System.currentTimeMillis();
        String password = "anypassword";

        webDriver.findElement(By.id("loginusername")).sendKeys(notExistUsername);
        webDriver.findElement(By.id("loginpassword")).sendKeys(password);
        webDriver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
        Thread.sleep(2000);

        Alert alert = webDriver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Uyarı mesajı (kullanıcı yok): " + alertText);

        Assert.assertEquals(alertText, "User does not exist.", "Alert mesajı beklenenle eşleşmiyor: " + alertText);
        alert.accept();

    }
}
