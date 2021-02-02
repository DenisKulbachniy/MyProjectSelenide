package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage {

    public ElementsCollection cartButton = $$(By.xpath(".//button[contains(@class, 'buy-button')]"));
    public WebElement productInCart = $(By.xpath(".//div[contains(@class, 'product__main')]"));
    public ElementsCollection playStationProductChoice = $$(By.xpath(".//span[contains(text(),'PlayStation 5')]"));
    public WebElement notifyAboutAppearingOfProductButton = $(By.xpath(".//button[contains(text(),'Сообщить')]"));
    public WebElement productTitle = $(By.xpath(".//h1[@class='product__title']"));
    public ElementsCollection wishButton = $$(By.xpath(".//button[contains(@class, 'wish')]"));
    public ElementsCollection productName = $$(By.xpath(".//span[contains(@class,'tile__title')]"));
    public ElementsCollection comparisonOfProductsButtons = $$(By.xpath(".//button[@class='compare-button']"));
    public WebElement contextCartMenu = $(By.xpath(".//button[contains(@class, 'context-menu')]"));
    public WebElement deleteButton = $(By.xpath(".//button[contains(@class, 'menu-actions')]"));
    public WebElement emptyCart = $(By.xpath(".//h4[contains(@class, 'cart')]"));
    public WebElement buyKit = $(By.xpath(".//button[contains(@class, 'buy-kit')]"));
    public WebElement kitInCart = $(By.xpath(".//div[@class='cart-kits']"));
    public WebElement contextWishListMenu = $(By.xpath(".//button[contains(@class, 'dropdown-css__toggle')]"));
    public WebElement deleteWishList = $(By.xpath(".//button[contains(@class, 'delete-wishlist')]"));
    public WebElement headerNameOfInput = $(By.xpath(".//h1[contains(@class,'heading')]"));
}
