package steps;

import pages.HomePage;
import pages.LoginPage;
import pages.PersonnelAccountPage;
import pages.ProductsPage;

public class BaseSteps {

    HomePage homePage;
    ProductsPage productsPage;
    LoginPage loginPage;
    PersonnelAccountPage personnelAccountPage;

    public BaseSteps() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        productsPage = new ProductsPage();
        personnelAccountPage = new PersonnelAccountPage();
    }
}
