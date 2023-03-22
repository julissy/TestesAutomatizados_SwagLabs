package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import utils.Utils;

public class TestesSteps {
    @Dado("que eu estou acessando o sistema")
    public void que_eu_estou_acessando_o_sistema() {
        Utils.acessarSistema();
    }
}
