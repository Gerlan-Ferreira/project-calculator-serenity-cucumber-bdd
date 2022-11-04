package gustavobelmont.calculator.ux.req003;

import gustavobelmont.calculator.ux.pages.ContactFormularyPageObject;
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
        assertThat(contactFormularyPageObject.getSuccessMessage(), is(messageSuccess));

    }
}
