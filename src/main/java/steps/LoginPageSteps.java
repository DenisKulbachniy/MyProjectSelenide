package steps;

public class LoginPageSteps extends BaseSteps{

    public void login(String login, String password){
        loginPage.enterToAccountLink.click();
        loginPage.loginField.sendKeys(login);
        loginPage.passwordField.sendKeys(password);
        loginPage.enterButton.click();
    }
    public String  getUserText(){
        return loginPage.userLink.getText();
    }
}
