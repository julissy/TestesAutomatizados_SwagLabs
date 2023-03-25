package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.driver;

public class LoginPage {

    @FindBy(name = "user-name" )
    private WebElement campoUsuario;

    @FindBy(name = "password" )
    private WebElement campoPassword;

    @FindBy(name = "login-button" )
    private WebElement botaoLogin;

    public void preencherUsername(String usuario) {
        campoUsuario.sendKeys(usuario);
    }

    public void preencherPassword(String password) {
        campoPassword.sendKeys(password);
    }

    public void clicarBotaoLogin() {
        botaoLogin.click();
    }

    public void fazerLogin(String usuario, String password) {
        preencherUsername(usuario);
        preencherPassword(password);
        clicarBotaoLogin();
    }
}
