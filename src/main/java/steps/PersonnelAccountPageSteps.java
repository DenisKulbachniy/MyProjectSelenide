package steps;

import constants.Constants;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PersonnelAccountPageSteps extends BaseSteps {

    public void createNewWishList(String wishListName) {
        personnelAccountPage.accountWishList.click();
        personnelAccountPage.createNewWishList.click();
        personnelAccountPage.myListOfWishes.sendKeys(wishListName);
        personnelAccountPage.addNewListOfWishes.click();
    }

    public void deleteWishList() {
        productsPage.contextWishListMenu.click();
        productsPage.deleteWishList.click();
    }
    public void checkEmptyWishList(){
        $(personnelAccountPage.emptyWishList).shouldHave(text(Constants.EMPTY_WISH_LIST));
    }
    public void checkNameOfCreatedWishList(){
        $(personnelAccountPage.nameOfCreatedWishList).shouldHave(text(Constants.LAPTOPS));
    }

    public void checkOutOfStockProduct(){
        $(productsPage.productName.get(0)).shouldHave(text(Constants.PLAYSTATION));
    }

    public void checkComparisonProducts(){
        $(productsPage.headerNameOfInput).shouldHave(text(Constants.COMPARING_LAPTOPS));
    }
    public void checkUser(){
        $(loginPage.userLink).shouldHave(text(Constants.USER_NAME));
    }
}
