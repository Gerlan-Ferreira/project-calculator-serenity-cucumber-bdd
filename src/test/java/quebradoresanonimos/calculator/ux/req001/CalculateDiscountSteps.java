package quebradoresanonimos.calculator.ux.req001;

import quebradoresanonimos.calculator.ux.pages.ProductFormPageObject;
import quebradoresanonimos.calculator.ux.pages.ProductResultPageObject;
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
    @Step
    public void assertThatDiscountFactorIs(String discountFactor) {
        assertThat(productResultPageObject.getValueOfDiscountFactor(), is(discountFactor));
    }

    @Step
    public void verifyDiscountFactorErrorMessage(String errorMessage) {
        assertThat(productResultPageObject.getDiscountFactorErrorMessage(), is(errorMessage));
    }

}
