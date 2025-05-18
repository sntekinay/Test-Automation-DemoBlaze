package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SignInPage extends BaseTest {

    @Step("Sign In Butonuna tıklanır.")
    public SignInPage clickSignIn()  throws InterruptedException{
        webDriver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        screenshot();
        return this;
    }
    @Step("Unique Username alanı doldurulur.")
    public SignInPage fillUniqueUsername(){
        webDriver.findElement(By.id("sign-username")).sendKeys(uniqueUsername);
        return this;
    }
    @Step("Username alanı doldurulur.")
    public SignInPage fillUsername(){
        webDriver.findElement(By.id("sign-username")).sendKeys(username);
        return this;
    }
    @Step("password alanı doldurulur.")
    public SignInPage fillPassword(){
        webDriver.findElement(By.id("sign-password")).sendKeys(password);
        return this;
    }
    @Step("Register Butonuna tıklanır.")
    public SignInPage clickRegister()  throws InterruptedException{
        webDriver.findElement(By.cssSelector("button[onclick='register()']")).click();
        screenshot();
        Thread.sleep(2000);
        return this;
    }
}
