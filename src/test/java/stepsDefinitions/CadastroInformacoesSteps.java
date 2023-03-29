package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.CadastroInformacoesPage;
import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

public class CadastroInformacoesSteps {




    private String campoObrigatorio = "Error:";
    private String telaOverview = "Checkout: Overview";

    private WebElement botaoCarrinho = driver.findElement(By.className("shopping_cart_link"));

    @Quando("clico no botao carrinho")
    public void clicoNoBotaoCarrinho()  {
        Na(CadastroInformacoesPage.class).clicarBotaoCarrinho();
    }
    @Quando("clico no botao checkout")
    public void clicoNoBotaoCheckout() {
        Na(CadastroInformacoesPage.class).clicarBotaoCheckout();
    }


    @Quando("informo first name {string}")
    public void informoFirstName(String string) {
        Na(CadastroInformacoesPage.class).preencherFirstName(string);
    }
    @Quando("informo last name {string}")
    public void informoLastName(String string) {
        Na(CadastroInformacoesPage.class).preencherLastName(string);
    }
    @Quando("informo zip code {int}")
    public void informoZipCode(Integer integer) {
        Na(CadastroInformacoesPage.class).preencherZipCode(Integer.valueOf(String.valueOf(integer)));
    }
    @Quando("clico no botao continue")
    public void clicoNoBotaoContinue() {
        Na(CadastroInformacoesPage.class).clicarBotaoContinue();
    }
    @Entao("o sistema exibe a tela overview")
    public void oSistemaExibeATelaOverview() {
        assertEquals(telaOverview, driver.findElement(By.className("title")).getText());
    }

    @Entao("o sistema exibe a mensagem de campo obrigatorio da tela")
    public void oSistemaExibeAMensagemDeCampoObrigatorioDaTela() {
        assertEquals(campoObrigatorio, driver.findElement(By.tagName("h3")).getText().contains("Error:"));
    }
}
