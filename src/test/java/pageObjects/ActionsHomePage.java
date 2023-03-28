package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.driver;

public class ActionsHomePage {

    @FindBy(id = "item_4_title_link")
    private WebElement produto;

    public void moverMouseProduto() {
        Actions acao = new Actions(driver);
        acao.moveToElement(produto).build().perform();
    }

    public void clicarNoProduto() {
        produto.click();
    }
}
