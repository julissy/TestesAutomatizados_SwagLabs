package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import static utils.Utils.driver;

public class HomePage {

    List<WebElement> listaProdutos = new ArrayList<>();

    public void clicarMenu() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    public void clicarLogout() {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }


    private void carregarListaProdutos() {
        listaProdutos = driver.findElements(By.xpath("//div[@class='inventory_item']"));
    }

    public int contarProdutos() {
        carregarListaProdutos();
        return listaProdutos.size();
    }

    public void clicarFunil() {
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
    }

    public void clicarNameZA() {
        WebElement element = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(element);
        select.selectByValue("za");
    }

    List<WebElement> ordemProdutos = new ArrayList<>();


    public String ordenarZA() {
        ordemProdutos = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        //novaOrdemProdutos
        //Arrays.sort(ordemProdutos, Collections.reverseOrder());
        for(WebElement element: ordemProdutos)
            System.out.print(element.getText());
        return ordemProdutos.toString();
    }



}


