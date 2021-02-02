package tests;

import constants.Constants;
import org.junit.Test;

public class ActionsWithProductsTest extends BaseTest {

    @Test
    public void productActionCartTest() {
        homePageSteps.navigateToLaptopCategory();
        productsPageSteps.addProductInCart();
        homePageSteps.navigateToProductCart();

        productsPageSteps.checkProductInCart();
    }

    @Test
    public void productKitActionCartTest() {
        homePageSteps.navigateToLaptopCategory();
        productsPageSteps.productNameClick();
        productsPageSteps.buyKit();
        homePageSteps.navigateToProductCart();

        productsPageSteps.checkKitInCart();
    }

    @Test
    public void productActionDeleteFromCartTest() {
        homePageSteps.navigateToLaptopCategory();
        productsPageSteps.addProductInCart();
        homePageSteps.navigateToProductCart();
        homePageSteps.deleteProductFromCart();

        productsPageSteps.checkEmptyCart();
    }

    @Test
    public void productActionWishListTest() {
        loginPageSteps.login(Constants.INPUT_FOR_LOGIN, Constants.INPUT_FOR_PASSWORD);
        homePageSteps.navigateToLaptopCategory();
        productsPageSteps.addProductInWishList();
        homePageSteps.navigateToHeaderWishList();

        productsPageSteps.checkProductInWishList();

        homePageSteps.deleteFromWishList();

        personnelAccountPageSteps.checkEmptyWishList();
    }

    @Test
    public void wishListNewOwnListCreationTest() {
        loginPageSteps.login(Constants.INPUT_FOR_LOGIN, Constants.INPUT_FOR_PASSWORD);
        personnelAccountPageSteps.createNewWishList(Constants.LAPTOPS);

        personnelAccountPageSteps.checkNameOfCreatedWishList();

        homePageSteps.navigateToLaptopCategory();
        productsPageSteps.addProductInWishList();
        homePageSteps.navigateToHeaderWishList();

        productsPageSteps.checkProductInWishList();

        personnelAccountPageSteps.deleteWishList();

        personnelAccountPageSteps.checkEmptyWishList();
    }

    @Test
    public void outOfStackProductTest() {
        loginPageSteps.login(Constants.INPUT_FOR_LOGIN, Constants.INPUT_FOR_PASSWORD);
        homePageSteps.navigateToPlayStationCategory();
        productsPageSteps.choosePlayStationProduct();
        productsPageSteps.productTitleActions();
        productsPageSteps.notifyAboutAppearingOfProductButtonClick();
        homePageSteps.navigateToHeaderWishList();

        personnelAccountPageSteps.checkOutOfStockProduct();

        personnelAccountPageSteps.deleteWishList();

        personnelAccountPageSteps.checkEmptyWishList();
    }

    @Test
    public void comparisonOfProductsTest() {
        homePageSteps.navigateToLaptopCategory();
        productsPageSteps.comparisonButtonsOfTwoProducts();
        homePageSteps.productsComparison();

        personnelAccountPageSteps.checkComparisonProducts();
    }
}
