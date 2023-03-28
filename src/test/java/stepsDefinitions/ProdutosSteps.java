package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.HomePage;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static utils.Utils.Na;
import static utils.Utils.driver;

public class ProdutosSteps {

    @Quando("vejo a tela principal")
    public void vejoATelaPrincipal() {
        assertEquals("Products", driver.findElement(By.xpath("//span[@class='title']")).getText());
    }


    @Entao("visualizo todos produtos")
    public void visualizoProdutos() {
        assertThat(Na(HomePage.class).contarProdutos(),is(6));}


    @Quando("clico no funil")
    public void clicoNoFunil() {
        Na(HomePage.class).clicarFunil();
    }


    @Quando("clico na opcao name ZA")
    public void clicoNaOpcaoNameZA() {
        Na(HomePage.class).clicarNameZA();
    }
    @Entao("os produtos ficam ordenados de ZA")
    public void osProdutosFicamOrdenadosDeZA() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
