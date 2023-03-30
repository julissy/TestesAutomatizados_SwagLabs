package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageObjects.LoginPage;
import utils.Utils;

import static utils.Utils.Na;

public class Hooks {

    @Before
    public void funcionalidadeLogin() {
        Utils.acessarSistema();

    }

   /* @After
    public void printarTela() {

    }*/

   /* @After
    public void tearDown(Scenario scenario) {
        Utils.capturarTela(scenario);
        Utils.finalizarAcesso();
    }*/
}
