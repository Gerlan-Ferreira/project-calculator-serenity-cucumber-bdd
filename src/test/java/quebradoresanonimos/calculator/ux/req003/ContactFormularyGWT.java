package quebradoresanonimos.calculator.ux.req003;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Então;
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
    @Então("o sistema apresenta a mensagem de sucesso corretamente")
    public void o_sistema_apresenta_a_mensagem_de_sucesso_corretamente(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        steps.assertThatSuccessMessage(data.get("messageSuccess"));
    }

    @Então("o sistema apresenta a mensagem de erro ao enviar o formulário")
    public void o_sistema_apresenta_a_mensagem_de_erro_ao_enviar_o_formulário(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        steps.assertThatErrorMessage(data.get("messageError"));
    }


}
