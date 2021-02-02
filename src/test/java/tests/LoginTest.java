package tests;

import constants.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void logInToAcc() {
        loginPageSteps.login(Constants.INPUT_FOR_LOGIN, Constants.INPUT_FOR_PASSWORD);

        personnelAccountPageSteps.checkUser();
    }
}
