package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public WebElement loginField = $(By.xpath(".//input[@id='auth_email']"));
    public WebElement passwordField = $(By.xpath(".//input[@id='auth_pass']"));
    public WebElement enterToAccountLink = $(By.xpath(".//button[contains(@class, 'user-link')]"));
    public WebElement userLink = $(By.xpath("//a[contains(@class,'user-link')]"));
    public WebElement enterButton = $(By.xpath(".//button[contains(text(),'Войти')]"));
}
