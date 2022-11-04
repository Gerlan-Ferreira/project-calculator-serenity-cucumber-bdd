package gustavobelmont.calculator.ux.shared;

import gustavobelmont.calculator.ux.pages.InitialPageObeject;
import gustavobelmont.calculator.ux.pages.ProductListPageObject;
import gustavobelmont.calculator.ux.pages.SharedPageObject;
import net.thucydides.core.annotations.Step;

public class SharedSteps {

    SharedPageObject sharedPageObject;
    InitialPageObeject initialPageObeject;

    ProductListPageObject productListPageObject;
    @Step
    public void openBrowserAndAccessURL() {
        sharedPageObject.openUrl("https://calculadora.diegoquirino.net/");
        sharedPageObject.setDefaultBrowserProperties();
    }

    @Step
    public void selectMenuCalcularDesconto()
    {
        initialPageObeject.accessMenuCalculateDiscount();
    }

    @Step void selectMenuContactFormulary(){
        initialPageObeject.accessMenuContactFormulary();
    }

    public void selectProductFromTableListById(int id) {
        productListPageObject.selectProductFromTableListById(id);
    }
}
