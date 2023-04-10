package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @FindBy(xpath = "//div[@class= 'inventory_details_name large_size']")
    private WebElement NomeProduto;

    @FindBy(className = "inventory_details_price")
    private WebElement PrecoProduto;

    public String obterNomeProduto() {
        return NomeProduto.getText();
    }

    public String obterPrecoProduto() {
        return PrecoProduto.getText();
    }
}
