package tests;

import constants.Constants;
import org.junit.Test;

public class SearchTest extends BaseTest{

    @Test
    public void searchTest() {
        homePageSteps.fillInSearchFieldAndSubmit(Constants.LAPTOP);

        productsPageSteps.checkHeaderProductText();
    }
}
