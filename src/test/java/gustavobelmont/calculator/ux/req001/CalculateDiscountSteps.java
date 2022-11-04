package gustavobelmont.calculator.ux.req001;

import gustavobelmont.calculator.ux.pages.ProductFormPageObject;
import gustavobelmont.calculator.ux.pages.ProductResultPageObject;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculateDiscountSteps {

    ProductFormPageObject productFormPageObject;

    ProductResultPageObject productResultPageObject;

    @Step
    public void sendCalculateForm(String clientType, String quantity) {
        productFormPageObject.setClientType(clientType);
        productFormPageObject.setQuantity(quantity);
        productFormPageObject.send();
    }

    public void assertThatDiscountFactorIs(String discountFactor) {
        assertThat(productResultPageObject.getValueOfDiscountFactor(), is(discountFactor));
    }
}
