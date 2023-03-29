package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Globals;

import java.util.concurrent.TimeUnit;

import static utils.Utils.driver;

public class CadastroInformacoesPage {

    private WebElement botaoCarrinho = driver.findElement(By.id("shopping_cart_container"));

    private WebElement botaoCheckout = driver.findElement(By.id("checkout"));

    private WebElement campoFirstName = driver.findElement(By.id("first-name"));

    private WebElement campoLastName = driver.findElement(By.id("last-name"));

    private WebElement campoZipCode = driver.findElement(By.id("postal-code"));

    @FindBy(name = "continue")
    private WebElement botaoContinue;

    public void clicarBotaoCarrinho() {
        driver.get(Globals.SAUCE_DEMO_CART_PAGE_URL);
    }

    public void clicarBotaoCheckout() {
        driver.get(Globals.SAUCE_DEMO_CHECKOUT_STEP_ONE_PAGE_URL);
    }

    public void preencherFirstName(String firstName) {
        campoFirstName.sendKeys(firstName);
    }

    public void preencherLastName(String lastName) {
        campoFirstName.sendKeys(lastName);
    }

    public void preencherZipCode(Integer integer) {
        campoFirstName.sendKeys(String.valueOf(integer));

    }

    public void clicarBotaoContinue() {
        botaoContinue.click();
    }

}
