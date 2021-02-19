package steps;

import com.codeborne.selenide.Configuration;
import constants.Constants;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePageSteps extends BaseSteps {

    public void openHomePageAndSwitchLanguage() {
        Configuration.startMaximized = true;
        open(Constants.BASEURI);
        homePage.languageRuOrUa.get(0).click();
    }

    public void navigateToLaptopCategory() {
        homePage.productsCatalogue.click();
        homePage.laptopCategory.click();
    }

    public void navigateToPlayStationCategory() {
        homePage.productsCatalogue.click();
        homePage.productForGamersCategory.click();
    }


    public void navigateToProductCart() {
        homePage.headerCartButton.click();
    }

    public void deleteProductFromCart() {
        productsPage.contextCartMenu.click();
        productsPage.deleteButton.click();
    }

    public void navigateToHeaderWishList() {
        homePage.activeHeaderWishListButton.click();
    }

    public void deleteFromWishList() {
        productsPage.contextWishListMenu.click();
        productsPage.deleteWishList.click();
    }

    public void productsComparison() {
        homePage.activeHeaderComparisonButton.click();
        homePage.comparisonList.click();
    }

    public void changeCity() {
        homePage.chooseCity.click();
        homePage.listOfCities.click();
        homePage.acceptButtonToChooseCity.click();
    }

    public void fillInSearchFieldAndSubmit(String inputText) {
        homePage.searchField.click();
        homePage.searchField.sendKeys(inputText);
        homePage.searchButton.click();
    }

    public void checkCity() {
        $(homePage.chooseCity).shouldHave(text(Constants.KIEV));
    }
}

