package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pageObjects.CarrinhoPage;
import utils.Utils;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;

public class CarrinhoSteps {

    @Quando("clico no botao Add to cart de todos os produtos")
    public void clicoNoBotaoAddToCartDeTodosOsProdutos() {
        Na(CarrinhoPage.class).clicarBotaoAdd();
    }

    @Entao("o botao cart apresenta seis itens")
    public void oBotaoCartApresentaSeisItens() {
        assertThat(Na(CarrinhoPage.class).itensCarrinho(), is(String.valueOf(6)));
    }

    @Quando("clico no botao Delete de todos os produtos")
    public void clicoNoBotaoDeleteDeTodosOsProdutos() {
        Na(CarrinhoPage.class).clicarBotaoDelete();
    }


    @Entao("o botao cart nao apresenta itens")
    public void oBotaoCartNaoApresentaItens() {
        assertThat(Na(CarrinhoPage.class).itensCarrinho(), is(""));
    }
}
