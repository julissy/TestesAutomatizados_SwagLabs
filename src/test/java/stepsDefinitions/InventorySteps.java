package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.InventoryPage;
import pageObjects.ProductPage;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static utils.Utils.Na;
import static utils.Utils.driver;

public class InventorySteps {

    @Quando("vejo a tela principal")
    public void vejoATelaPrincipal() {
        assertEquals("Products", driver.findElement(By.xpath("//span[@class='title']")).getText());
    }


    @Entao("visualizo todos produtos")
    public void visualizoProdutos() {
        assertThat(Na(InventoryPage.class).contarProdutos(),is(6));}


    @Quando("clico no funil")
    public void clicoNoFunil() {
        Na(InventoryPage.class).clicarFunil();
    }


    @Quando("clico na opcao name ZA")
    public void clicoNaOpcaoNameZA() {
        Na(InventoryPage.class).clicarNameZA();
    }


    @Entao("os produtos estao ordenados de AZ")
    public void osProdutosEstaoOrdenadosDeAZ() {
        assertEquals(Na(InventoryPage.class).listaProdutosInicial(), Na(InventoryPage.class).filtrarNomesProdutos());
    }


    @Entao("os produtos ficam ordenados de ZA")
    public void osProdutosFicamOrdenadosDeZA() {
        assertEquals(Na(InventoryPage.class).inverterNomesProdutosInicial(), Na(InventoryPage.class).filtrarNomesProdutos());
    }

    @Quando("clico na opcao price low-high")
    public void clicoNaOpcaoPriceLowHigh() {
        Na(InventoryPage.class).clicarPriceLoHi();
    }


    @Entao("os produtos ficam ordenados preco menor para maior")
    public void osProdutosFicamOrdenadosPrecoMenorParaMaior() {
        assertEquals(Na(InventoryPage.class).inverterPrecoProdutosInicial(), Na(InventoryPage.class).filtrarPrecoProdutos());
    }

    @Quando("clico na opcao price high-low")
    public void clicoNaOpcaoPriceHighLow() {
        Na(InventoryPage.class).clicarPriceHiLo();
    }


    @Entao("os produtos ficam ordenados preco maior para menor")
    public void osProdutosFicamOrdenadosPrecoMaiorParaMenor() {
        assertEquals(Na(InventoryPage.class).listaPrecoProdutosInicial(), Na(InventoryPage.class).filtrarPrecoProdutos());
    }

    @Quando("vejo o produto {int}")
    public void vejoOProduto(Integer int1) {
        String produto = Na(InventoryPage.class).obterNomeProduto(int1);
        System.out.println(produto);
    }


    @Quando("clico no produto {int}")
    public void clicoNoProduto(Integer int1) {
        Na(InventoryPage.class).clicarProduto(int1);
    }
    @Entao("os detalhes do produto {int} sao iguais")
    public void osDetalhesDoProdutoSaoIguais(Integer int2) {
        assertEquals(Na(InventoryPage.class).obterNomeProduto(int2) , Na(ProductPage.class).obterNomeProduto());
      }

}
