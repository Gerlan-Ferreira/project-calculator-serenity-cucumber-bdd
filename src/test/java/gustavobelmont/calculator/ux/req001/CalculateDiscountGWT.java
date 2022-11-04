package gustavobelmont.calculator.ux.req001;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class CalculateDiscountGWT {

    @Steps
    CalculateDiscountSteps steps;

    @Quando("informa os dados no formulário do cálculo do desconto")
    public void informa_os_dados_no_formulário_do_cálculo_do_desconto(DataTable dataTable) {

        Map<String, String> data = dataTable.asMap();
        steps.sendCalculateForm(data.get("clientType"), data.get("quantity"));
    }

    @Entao("o sistema apresenta o fator de desconto do produto corretamente")
    public void o_sistema_apresenta_o_fator_de_desconto_do_produto_corretamente(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        steps.assertThatDiscountFactorIs(data.get("discountFactor"));

    }
}
