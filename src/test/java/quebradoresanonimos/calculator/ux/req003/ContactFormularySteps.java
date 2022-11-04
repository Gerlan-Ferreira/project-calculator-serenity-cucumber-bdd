package quebradoresanonimos.calculator.ux.req003;

import quebradoresanonimos.calculator.ux.pages.ContactFormularyPageObject;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactFormularySteps {

    ContactFormularyPageObject contactFormularyPageObject;

    @Step
    public void sendFormularyContact(String name, String email, String typeMessage, String userAge, String writeHereYourMessage){
        contactFormularyPageObject.setName(name);
        contactFormularyPageObject.setEmail(email);
        contactFormularyPageObject.selectTypeMessage(typeMessage);
        contactFormularyPageObject.setAge(userAge);
        contactFormularyPageObject.setWriteHereYourMessage(writeHereYourMessage);
        contactFormularyPageObject.send();

    }

    @Step
    public void assertThatSuccessMessage(String messageSuccess){
        assertThat(contactFormularyPageObject.getMessageAlert(), is(messageSuccess));

    }

    @Step
    public void assertThatErrorMessage(String messageError){
        assertThat(contactFormularyPageObject.getMessageAlert(), is(messageError));

    }
}
