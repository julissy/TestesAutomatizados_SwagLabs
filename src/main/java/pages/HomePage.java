package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    private WebDriver driver;

    List<WebElement> listaProdutos = new ArrayList<>();

    private By produtos = By.className("inventory_item");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public int contarProdutos() {
        carregarListaDeProdutos();
        return listaProdutos.size();
    }

    private void carregarListaDeProdutos() {
        listaProdutos = driver.findElements(produtos);
    }
}
