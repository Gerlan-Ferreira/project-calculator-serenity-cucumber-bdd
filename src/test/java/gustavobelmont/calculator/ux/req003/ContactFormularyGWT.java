package gustavobelmont.calculator.ux.req003;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class ContactFormularyGWT {

    @Steps
    ContactFormularySteps steps;

    @Quando("informa os dados no formulário de contato")
    public void informa_os_dados_no_formulário_de_contato(DataTable dataTable) {

        Map<String, String> data = dataTable.asMap();
        steps.sendFormularyContact(data.get("name"), data.get("email"), data.get("typeMessage"), data.get("userAge"), data.get("writeHereYourMessage"));

    }
    @Entao("o sistema apresenta a mensagem de sucesso corretamente")
    public void o_sistema_apresenta_a_mensagem_de_sucesso_corretamente(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        steps.assertThatSuccessMessage(data.get("discountFactor"));
    }


}
