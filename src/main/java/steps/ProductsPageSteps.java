package steps;

import constants.Constants;
import org.openqa.selenium.StaleElementReferenceException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProductsPageSteps extends BaseSteps {

    public void productNameClick() {
        int attempt = 0;
        while (attempt < 5) {
            try {
                productsPage.productName.get(0).click();
                break;
            } catch (StaleElementReferenceException e) {
            }
            attempt++;
        }
    }

    public void addProductInCart() {
        int attempt = 0;
        while (attempt < 5) {
            try {
                productsPage.cartButton.get(0).click();
                break;
            } catch (StaleElementReferenceException e) {
            }
            attempt++;
        }
    }

    public void addProductInWishList() {
        int attempt = 0;
        while (attempt < 5) {
            try {
                productsPage.wishButton.get(0).click();
                break;
            } catch (StaleElementReferenceException e) {
            }
            attempt++;
        }
    }

    public void choosePlayStationProduct() {
        int attempt = 0;
        while (attempt < 1) {
            try {
                homePage.playstationStoreCategory.click();
                productsPage.playStationProductChoice.get(0).click();
                productsPage.productTitle.click();
            } catch (StaleElementReferenceException e) {
            }
            attempt++;
        }
    }

    public void buyKit() {
        productsPage.buyKit.click();
    }

    public void productTitleActions() {
        productsPage.productTitle.click();
    }

    public String getProductNameText() {
        return productsPage.productName.get(0).getText();
    }

    public void notifyAboutAppearingOfProductButtonClick() {
        productsPage.notifyAboutAppearingOfProductButton.click();
    }

    public void comparisonButtonsOfTwoProducts() {
        int attempt = 0;
        while (attempt < 5) {
            try {
                productsPage.comparisonOfProductsButtons.get(0).click();
                productsPage.comparisonOfProductsButtons.get(1).click();
            } catch (Exception e) {
            }
            attempt++;
        }
    }

    public String getHeaderProductsText() {
        return productsPage.headerNameOfInput.getText();
    }

    public void checkProductInCart() {
        $(productsPage.productInCart).shouldHave(text(Constants.LAPTOP));
    }

    public void checkProductInWishList() {
        $(productsPage.productName.get(0)).shouldHave(text(Constants.LAPTOP));
    }

    public void checkKitInCart() {
        $(productsPage.kitInCart).shouldHave(text(Constants.TOGETHER_CHEAP));
    }

    public void checkEmptyCart() {
        $(productsPage.emptyCart).shouldHave(text(Constants.CART_IS_EMPTY));
    }

    public void checkHeaderProductText() {
        $(productsPage.headerNameOfInput).shouldHave(text(Constants.LAPTOPS));
    }
}
