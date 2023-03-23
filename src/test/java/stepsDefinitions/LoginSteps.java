package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.LoginPage;

import utils.Utils;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    @Quando("informo username {string}")
    public void informoUsername(String string) {
        loginPage.preencherUsername(string);
    }
    @Quando("informo password {string}")
    public void informoPassword(String string) {
        loginPage.preencherPassword(string);
    }
    @Quando("clico no botao de login")
    public void clicarNoBotaoDeLogin() {
        loginPage.clicarBotaoLogin();
    }

    private String mensagemError = "Epic sadface: Username and password do not match any user in this service";
    @Entao("o sistema exibe a mensagem usuario invalido")
    public void oSistemaExibeAMensagemUsuarioInvalido() {
        assertEquals(mensagemError, driver.findElement(By.tagName("h3")).getText());
    }

    @Entao("o sistema exibe usuario logado")
    public void oSistemaExibeUsuarioLogado() {
        assertEquals("Swag Labs", driver.findElement(By.className("app_logo")).getText());
    }



}
