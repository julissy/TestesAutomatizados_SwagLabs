package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.Utils.driver;

public class InventoryPage {

    private List<WebElement> listaProdutos = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

    private List<WebElement> listaProdutosComparacao = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

    private List<WebElement> listaPreco = driver.findElements(By.className("inventory_item_price"));

    private List<WebElement> listaPrecoComparacao = driver.findElements(By.className("inventory_item_price"));

    public void clicarMenu() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    public void clicarLogout() {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    public int contarProdutos() {
        return listaProdutos.size();
    }

    public String todosProdutos() {
        listaProdutos.forEach( it -> {
            it.getText();
        });
        return listaProdutos.toString();
    }

    public void clicarFunil() {
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
    }

    public void clicarNameZA() {
        WebElement element = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(element);
        select.selectByValue("za");
    }


    public String ordenarNomesComparacao() {
        listaProdutosComparacao.forEach(itComparacao -> {
            itComparacao.getText();
        });
        return listaProdutosComparacao.toString();
    }

    public void clicarPriceLoHi() {
        WebElement element = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(element);
        select.selectByValue("lohi");
    }

    public void clicarPriceHiLo() {
        WebElement element = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(element);
        select.selectByValue("hilo");
    }

    public String todosOsPrecoProdutos() {
        listaPreco.forEach(it -> {
            it.getText();
        });
        return listaPreco.toString();
    }

    public String precoComparacao() {
        listaPrecoComparacao.forEach(itComparacao -> {
            itComparacao.getText();
        });
        return listaPrecoComparacao.toString();
    }
}




