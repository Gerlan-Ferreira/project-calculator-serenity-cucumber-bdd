package gustavobelmont.calculator.ux.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ContactFormularyPageObject extends PageObject {

   // String mensagem = "";

    @FindBy(id = "nome")
    private WebElement name;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(xpath="//input[contains(@name, 'tipo')]")
    private List<WebElement> allTypeMessages;

    @FindBy(id = "idade")
    private WebElement userAge;

    @FindBy(id = "mensagem")
    private WebElement writeHereYourMessage;

    @FindBy(xpath = "//div[@class='alert alert-dismissable alert-success']//span")
    //(css = "div.alert > span")

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
         for(WebElement e: allTypeMessages){
                if(e.getAttribute("value").contains((value))){
                    e.click();
                    break;
                }
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
        System.out.println("MENSAGEM DE SUCESSO QUE TA RETORNANDO EH: " + messageSuccess.getText());
        return messageSuccess.getText();
    }



}
