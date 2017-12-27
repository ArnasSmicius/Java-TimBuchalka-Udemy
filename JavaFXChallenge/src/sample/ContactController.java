package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.datamodel.Contact;

public class ContactController {

    @FXML
    TextField firstName;

    @FXML
    TextField lastName;

    @FXML
    TextField phoneNumber;

    @FXML
    TextField notes;

    public Contact processResults() {
        Contact newContact = new Contact();
        newContact.setFirstName(firstName.getText());
        newContact.setLastName(lastName.getText());
        newContact.setPhoneNumber(phoneNumber.getText());
        newContact.setNotes(notes.getText());

        return newContact;
    }

    public void fillTheGaps(Contact contact) {
        firstName.setText(contact.getFirstName().toString());
        lastName.setText(contact.getLastName().toString());
        phoneNumber.setText(contact.getPhoneNumber().toString());
        notes.setText(contact.getNotes().toString());
    }

    public void updateTheContact(Contact contact) {
        contact.setFirstName(firstName.getText());
        contact.setLastName(lastName.getText());
        contact.setPhoneNumber(phoneNumber.getText());
        contact.setNotes(notes.getText());
    }
}
