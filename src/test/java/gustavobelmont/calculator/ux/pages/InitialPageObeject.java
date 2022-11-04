package gustavobelmont.calculator.ux.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialPageObeject extends PageObject {

    @FindBy(css = "a.nav-link[href='/produtos']")
    private WebElement linkMenuCalculateDiscount;

    @FindBy(css = "a.nav-link[href='/contato']")
    private WebElement linkMenuContactFormulary;

    public void accessMenuCalculateDiscount(){
        linkMenuCalculateDiscount.click();
    }

    public void accessMenuContactFormulary(){
        linkMenuContactFormulary.click();
    }

}
