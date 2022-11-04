package gustavobelmont.calculator.ux.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductResultPageObject extends PageObject {

    @FindBy(id = "fator")
    private WebElement inputDiscountFactor;

    public String getValueOfDiscountFactor(){
        return inputDiscountFactor.getAttribute("value");
    }

}
