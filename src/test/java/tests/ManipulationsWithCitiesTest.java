package tests;

import org.junit.Test;

public class ManipulationsWithCitiesTest extends BaseTest{

    @Test
    public void tryToChangeCityTest() {
        homePageSteps.changeCity();

        homePageSteps.checkCity();
    }
}
