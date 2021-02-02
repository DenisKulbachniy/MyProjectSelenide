package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class PersonnelAccountPage {

    public WebElement accountWishList = $(By.xpath(".//li[contains(@class,'main')]//following-sibling::a[contains(text(), 'Списки')]"));
    public WebElement createNewWishList = $(By.xpath(".//button[contains(text(), 'Создать')]"));
    public WebElement myListOfWishes = $(By.xpath(".//input[contains(@placeholder, 'Мой список желаний')]"));
    public WebElement addNewListOfWishes = $(By.xpath(".//button[contains(@type, 'submit')]"));
    public WebElement nameOfCreatedWishList = $(By.xpath(".//h3[contains(@class,'wish')]"));
    public WebElement emptyWishList = $(By.xpath(".//h3[contains(text(),'У вас еще нет списков желаний')]"));
}
