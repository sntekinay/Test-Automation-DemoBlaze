package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LogInPage extends BaseTest {
    @Step("Log In Butonuna tıklanır.")
    public LogInPage clickLogIn()  throws InterruptedException{
        webDriver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        return this;
    }
    @Step("Username alanı doldurulur.")
    public LogInPage fillUsername(){
        webDriver.findElement(By.id("loginusername")).sendKeys(username);
        return this;
    }
    @Step("Unique Username alanı doldurulur.")
    public LogInPage fillNotExistUsername(){
        webDriver.findElement(By.id("loginusername")).sendKeys(notExistUsername);
        return this;
    }
    @Step("Password alanı doldurulur.")
    public LogInPage fillPassword(){
        webDriver.findElement(By.id("loginpassword")).sendKeys(password);
        return this;
    }
    @Step("wrong Password alanı doldurulur.")
    public LogInPage fillWrongPassword(){
        webDriver.findElement(By.id("loginpassword")).sendKeys(wrongPassword);
        return this;
    }
    @Step("Register Butonuna tıklanır.")
    public LogInPage clickLogInInside()  throws InterruptedException{
        webDriver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
        Thread.sleep(3000);
        return this;
    }


}
