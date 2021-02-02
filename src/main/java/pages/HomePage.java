package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    public ElementsCollection languageRuOrUa = $$(By.xpath(".//li[contains(@class, 'language')]"));
    public WebElement productsCatalogue = $(By.xpath(".//span[starts-with(@class, 'menu-toggler')]"));
    public WebElement laptopCategory = $(By.xpath(".//a[contains(@class, 'hidden') and contains(text(), 'Ноутбуки')]"));
    public WebElement headerCartButton = $(By.xpath(".//a[contains(@class, 'basket')]"));
    public WebElement productForGamersCategory = $(By.xpath(".//a[contains(@class,'hidden') and contains(text(), 'Товары для геймеров')]"));
    public WebElement playstationStoreCategory = $(By.xpath(".//span[contains(@class, 'popular') and contains(text(),'PlayStation')]"));
    public WebElement activeHeaderWishListButton = $(By.xpath(".//a[contains(@class, 'wish header')]"));
    public WebElement activeHeaderComparisonButton = $(By.xpath(".//button[contains(@class, 'compare header')]"));
    public WebElement comparisonList = $(By.xpath(".//ul[contains(@class, 'comparison')]"));
    public WebElement chooseCity = $(By.xpath(".//button[contains(@class, 'header-cities')]"));
    public WebElement listOfCities = $(By.xpath(".//a[@class='header-location__popular-link']"));
    public WebElement acceptButtonToChooseCity = $(By.xpath(".//button[contains(text(), 'Применить')]"));
    public WebElement searchField = $(By.xpath(".//input[contains(@class, 'search-form')]"));
    public WebElement searchButton = $(By.xpath(".//button[contains(@class,'submit')]"));
}
