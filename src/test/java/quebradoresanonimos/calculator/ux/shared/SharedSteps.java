package quebradoresanonimos.calculator.ux.shared;

import quebradoresanonimos.calculator.ux.pages.InitialPageObeject;
import quebradoresanonimos.calculator.ux.pages.ProductListPageObject;
import quebradoresanonimos.calculator.ux.pages.SharedPageObject;
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
    @Step
    public void selectProductFromTableListById(int id) {
        productListPageObject.selectProductFromTableListById(id);
    }
}
