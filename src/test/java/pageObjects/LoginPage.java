package pageObjects;

import org.openqa.selenium.By;
import static utils.Utils.driver;

public class LoginPage {

    public void preencherUsername(String usuario) {
        driver.findElement(By.name("user-name")).sendKeys(usuario);
    }

    public void preencherPassword(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void clicarBotaoLogin() {
        driver.findElement(By.id("login-button")).click();

    }
}
