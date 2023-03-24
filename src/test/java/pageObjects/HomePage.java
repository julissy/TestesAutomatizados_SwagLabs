package pageObjects;

import org.openqa.selenium.By;
import static utils.Utils.driver;

public class HomePage {

    public void clicarMenu() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    public void clicarLogout() {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
}
