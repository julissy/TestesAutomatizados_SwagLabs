package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static utils.Utils.driver;

public class HomePage {

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement botaoMenu;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement botaoLogout;

    List<WebElement> listaProdutos = new ArrayList<>();

    public void clicarMenu() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    public void clicarLogout() {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    /*public void clicarMenu() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
        element.click();
    }

    public void clicarLogout() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        botaoLogout.click();
    }*/


    private void carregarListaProdutos() {
        listaProdutos = driver.findElements(By.xpath("//div[@class='inventory_item']"));
    }

    public int contarProdutos() {
        carregarListaProdutos();
        return listaProdutos.size();
    }

}


