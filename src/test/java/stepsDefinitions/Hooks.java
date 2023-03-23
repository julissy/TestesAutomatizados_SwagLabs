package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Utils;

public class Hooks {

    @Before
    public void setUp() {
        Utils.acessarSistema();

    }

   // @After
   // public void tearDown() {
   //     Utils.finalizarAcesso();
   // }
}
