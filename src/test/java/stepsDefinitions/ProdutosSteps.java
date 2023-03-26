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

}
