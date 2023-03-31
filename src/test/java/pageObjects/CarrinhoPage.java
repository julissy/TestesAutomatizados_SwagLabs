package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.Utils.driver;

public class CarrinhoPage {

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    private List<WebElement> botaoAdd;

    @FindBy(xpath = "//button[@class='btn btn_secondary btn_small btn_inventory']")
    private List<WebElement> botaoDelete;


    public void clicarBotaoAdd() {
        botaoAdd.forEach(it -> {
            it.click();
        });
    }

    public void clicarBotaoDelete() {
        botaoDelete.forEach(it -> {
            it.click();
        });
    }

    public String itensCarrinho() {
        return driver.findElement(By.cssSelector("#shopping_cart_container .shopping_cart_link"))
                .getText();
    }
}
