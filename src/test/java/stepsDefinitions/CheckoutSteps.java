package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.CheckoutPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

public class CheckoutSteps {


    private String campoObrigatorio = "Error:";
    private String telaOverview = "Checkout: Overview";


    @Quando("clico no botao carrinho")
    public void clicoNoBotaoCarrinho() {
        Na(CheckoutPage.class).clicarBotaoCarrinho();
    }


    @Quando("clico no botao checkout")
    public void clicoNoBotaoCheckout() {
        Na(CheckoutPage.class).clicarBotaoCheckout();
    }


    @Quando("informo first name {string}")
    public void informoFirstName(String string) {
        Na(CheckoutPage.class).preencherFirstName(string);
    }

    @Quando("informo last name {string}")
    public void informoLastName(String string) {
        Na(CheckoutPage.class).preencherLastName(string);
    }

    @Quando("informo zip code {string}")
    public void informoZipCode(String string) {
        Na(CheckoutPage.class).preencherZipCode(string);

    }


    @Quando("clico no botao continue")
    public void clicoNoBotaoContinue() {
        Na(CheckoutPage.class).clicarBotaoContinue();
    }

    @Entao("o sistema exibe a tela overview")
    public void oSistemaExibeATelaOverview() {
        assertEquals(telaOverview, driver.findElement(By.className("title")).getText());
    }

    @Entao("o sistema exibe a mensagem de campo obrigatorio da tela")
    public void oSistemaExibeAMensagemDeCampoObrigatorioDaTela() {
        assertTrue(campoObrigatorio, driver.findElement(By.tagName("h3")).getText().contains("Error:"));
    }
}
