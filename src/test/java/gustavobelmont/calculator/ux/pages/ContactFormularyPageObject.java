package gustavobelmont.calculator.ux.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactFormularyPageObject extends PageObject {

   // String mensagem = "";

    @FindBy(id = "nome")
    private WebElement name;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(xpath="//input[contains(@name, 'tipo')]")
    private WebElement typeMessage;

    @FindBy(id = "idade")
    private WebElement userAge;

    @FindBy(id = "mensagem")
    private WebElement writeHereYourMessage;

    @FindBy(css = "div.alert > span")
    private WebElement messageSuccess;




    public ContactFormularyPageObject() {
    }

    public void setName(String nameValue){
        new SharedPageObject().sendKeys(name, nameValue);

    }

    public void setEmail(String emailValue){
        new SharedPageObject().sendKeys(email, emailValue);
    }

    public void selectTypeMessage(String value){

        if(typeMessage.getAttribute("value").equals(value)){

            typeMessage.click();
        }
    }

    public void setAge(String ageValue){
        new Select(userAge).selectByValue(ageValue);
    }

    public void setWriteHereYourMessage(String yourMessage){
        new SharedPageObject().sendKeys(writeHereYourMessage, yourMessage);
    }
    public void send(){
        this.writeHereYourMessage.submit();
    }

    public String getSuccessMessage(){
        return messageSuccess.getText();
    }



}
