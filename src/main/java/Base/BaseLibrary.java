package Base;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseLibrary extends Data{
    public static WebDriver webDriver;

    @Step("welcome text")
    public static String getWelcomeText() {
        String welcomeText = webDriver.findElement(By.id("nameofuser")).getText();
        System.out.println("Giriş sonrası görünen yazı: " + welcomeText);
        return welcomeText;
    }
    @Step("ALert Bilgisi ALınır")
    public static String getAndAcceptAlertText() {
        String alertText = webDriver.switchTo().alert().getText();
        System.out.println("Uyarı mesajı: " + alertText);
        webDriver.switchTo().alert().accept();
        return alertText;
    }



}

