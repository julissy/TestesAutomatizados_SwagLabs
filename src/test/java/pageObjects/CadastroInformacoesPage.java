package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.driver;

public class CadastroInformacoesPage {

    @FindBy(className = "shopping_cart_link")
    private WebElement botaoCarrinho;

    @FindBy(id = "checkout")
    private WebElement botaoCheckout;

    @FindBy(id = "first-name")
    private WebElement campoFirstName;

    @FindBy(id = "last-name")
    private WebElement campoLastName;

    @FindBy(id = "postal-code")
    private WebElement campoZipCode;

    @FindBy(name = "continue")
    private WebElement botaoContinue;


    public void clicarBotaoCarrinho() {
        botaoCarrinho.click();
    }

    public void clicarBotaoCheckout() {
        botaoCheckout.click();
    }

    public void preencherFirstName(String firstName) {
        campoFirstName.sendKeys(firstName);
    }

    public void preencherLastName(String lastName) {
        campoLastName.sendKeys(lastName);
    }

    public void preencherZipCode(String zipcode) {
        campoZipCode.sendKeys(zipcode);
    }

    public void clicarBotaoContinue() {
        botaoContinue.click();
    }

}
