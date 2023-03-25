package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.driver;

public class HomePage {

    @FindBy(id = "react-burger-menu-btn")
    private WebElement botaoMenu;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement botaoLogout;

    public void clicarMenu() {
        botaoMenu.click();
    }

    public void clicarLogout() {
        botaoLogout.click();
    }
}
