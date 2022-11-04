package gustavobelmont.calculator.ux.shared;

import io.cucumber.java.pt.Dado;
import net.thucydides.core.annotations.Steps;

public class ShareGWT {

    @Steps
    SharedSteps steps;

    @Dado("que o usuario está na página inicial do sistema")
    public void que_o_usuario_está_na_página_inicial_do_sistema() {
       steps.openBrowserAndAccessURL();
    }
    @Dado("deseja selecionar um produto para calcular o desconto")
    public void deseja_selecionar_um_produto_para_calcular_o_desconto() {
        steps.selectMenuCalcularDesconto();
        steps.selectProductFromTableListById(2);
    }

    @Dado("deseje acessar o formulario de contato")
    public void deseje_acessar_o_formulario_de_contato() {
       steps.selectMenuContactFormulary();
    }

}
