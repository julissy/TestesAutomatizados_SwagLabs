package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.ActionsHomePage;
import pageObjects.HomePage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.driver;

public class ActionsHomePageSteps {

    @Quando("eu mover o mouse para nome do produto")
    public void euMoverOMouseParaNomeDoProduto() {
        Na(ActionsHomePage.class).moverMouseProduto();
    }

    @Quando("clico no nome do produto")
    public void clicoNoNomeDoProduto() {
        Na(ActionsHomePage.class).clicarNoProduto();
    }


    @Entao("o sistema exibe a pagina do produto")
    public void oSistemaExibeAPaginaDoProduto() {
        assertEquals("Sauce Labs Backpack", driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']")).getText());
    }
}
