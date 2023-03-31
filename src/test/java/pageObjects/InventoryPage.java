package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

import static utils.Utils.driver;

public class InventoryPage {

    private List<WebElement> listaProdutos = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
    private List<WebElement> listaProdutosComparacao;

    private List<WebElement> listaPreco = driver.findElements(By.className("inventory_item_price"));

    private List<WebElement> listaPrecoComparacao;

    public void clicarMenu() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    public void clicarLogout() {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    public int contarProdutos() {
        listaProdutosInicial();
        return listaProdutos.size();
    }

    public String listaProdutosInicial() {
        return listaProdutos.toString();
    }


    public void clicarFunil() {
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
    }


    public void clicarNameZA() {
        listaProdutosInicial();
        WebElement element = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(element);
        select.selectByValue("za");
    }


    public String filtrarNomesProdutos() {
        this.listaProdutosComparacao =
                driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        return listaProdutosComparacao.toString();
    }


    public String inverterNomesProdutosInicial() {
        Collections.reverse(listaProdutos);
        return listaProdutos.toString();
    }

    public void clicarPriceLoHi() {
        listaPrecoProdutosInicial();
        WebElement element = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(element);
        select.selectByValue("lohi");
    }

    public void clicarPriceHiLo() {
        listaPrecoProdutosInicial();
        WebElement element = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(element);
        select.selectByValue("hilo");
    }

    public String listaPrecoProdutosInicial() {
        return listaPreco.toString();
    }

    public String filtrarPrecoProdutos() {
        this.listaPrecoComparacao = driver.findElements(By.className("inventory_item_price"));
        return listaPrecoComparacao.toString();
    }

    public String inverterPrecoProdutosInicial() {
        Collections.reverse(listaPreco);
        return listaPreco.toString();
    }

}




