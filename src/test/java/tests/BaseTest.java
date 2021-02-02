package tests;

import org.junit.BeforeClass;
import steps.HomePageSteps;
import steps.LoginPageSteps;
import steps.PersonnelAccountPageSteps;
import steps.ProductsPageSteps;

public class BaseTest {

    protected static HomePageSteps homePageSteps;
    protected static LoginPageSteps loginPageSteps;
    protected static PersonnelAccountPageSteps personnelAccountPageSteps;
    protected static ProductsPageSteps productsPageSteps;

    @BeforeClass
    public static void setUp() {
        homePageSteps = new HomePageSteps();
        loginPageSteps = new LoginPageSteps();
        personnelAccountPageSteps = new PersonnelAccountPageSteps();
        productsPageSteps = new ProductsPageSteps();
        homePageSteps.openHomePageAndSwitchLanguage();
    }
}
