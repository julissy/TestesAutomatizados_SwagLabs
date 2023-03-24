package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import utils.Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

public class LoginSteps {

    private String mensagemError = "Epic sadface: Username and password do not match any user in this service";
    private String mensagemCampoObrigatorio = "Epic sadface:";
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
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
    @Entao("o sistema exibe a mensagem usuario invalido")
    public void oSistemaExibeAMensagemUsuarioInvalido() {
        assertEquals(mensagemError, driver.findElement(By.tagName("h3")).getText());
    }
    @Entao("o sistema exibe usuario logado")
    public void oSistemaExibeUsuarioLogado() {
        assertEquals("Swag Labs", driver.findElement(By.className("app_logo")).getText());
    }
    @Quando("informo password secret_sauce")
    public void informoPasswordSecretSauce(String string) {
        loginPage.preencherPassword(string);
    }
    @Entao("o sistema exibe a mensagem de campo obrigatorio")
    public void oSistemaExibeAMensagemDeCampoObrigatorio() {
        assertTrue(mensagemCampoObrigatorio, driver.findElement(By.tagName("h3")).getText().contains("Epic sadface:"));
    }
    @Quando("informo username standard_user")
    public void informoUsernameStandardUser(String string) {
        loginPage.preencherUsername(string);
    }
    @Quando("informo password ")
    public void informoPassword() {
        loginPage.preencherPassword("");
    }
    @Quando("clico no menu")
    public void clicoNoMenu() {
        homePage.clicarMenu();
    }
    @Quando("clico em logout")
    public void clicoEmLogout() {
        homePage.clicarLogout();
    }
    @Entao("retorno para a pagina inicial")
    public void retornoParaAPaginaInicial() {
        assertEquals("Swag Labs", driver.findElement(By.className("login_logo")).getText());
    }
}
