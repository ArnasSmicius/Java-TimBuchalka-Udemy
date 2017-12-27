package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import sample.datamodel.Contact;
import sample.datamodel.ContactData;

import java.io.IOException;
import java.util.Optional;

public class Controller {

    ContactData data;

    @FXML
    TableView<Contact> table;

    @FXML
    TableColumn firstNameColumn;

    @FXML
    TableColumn lastNameColumn;

    @FXML
    TableColumn phoneNumberColumn;

    @FXML
    TableColumn notesColumn;

    @FXML
    BorderPane mainBorderPane;

    @FXML
    public void handleAddEvent() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Add new contact");
        dialog.setHeaderText("Use this dialog to create new contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("contactDialog.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch(IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK) {
            //Do this if OK was pressed
            ContactController controller = fxmlLoader.getController();
            Contact newContact = controller.processResults();
            System.out.println(newContact);
            data.addContact(newContact);
            data.saveContacts();
        }
    }

    public void handleDeleteEvent() {
        Contact selectedContact = table.getSelectionModel().getSelectedItem();
        if(selectedContact != null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirm deliting a contact");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure that you want to delete " + selectedContact.getFirstName() + "?");
            Optional result = alert.showAndWait();
                if(result.isPresent() && result.get() == ButtonType.OK) {
                    data.deleteContact(selectedContact);
                    data.saveContacts();
                }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("No Contact Selected!");
            alert.setHeaderText(null);
            alert.setContentText("Select the contact that you want to delete");
            alert.show();
            return;
        }
    }

    public void handleEditEvent() {
        Contact selectedContact = table.getSelectionModel().getSelectedItem();
        if(selectedContact == null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("No Contact Selected!");
            alert.setHeaderText(null);
            alert.setContentText("Select the contact that you want to edit");
            alert.show();
            return;
        }


        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Edit contact");
        dialog.setHeaderText("Use this dialog to edit the contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("contactDialog.fxml"));

        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch(IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.FINISH);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        ContactController controller = fxmlLoader.getController();

        controller.fillTheGaps(selectedContact);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.FINISH) {
            controller.updateTheContact(selectedContact);
            data.saveContacts();
        }
    }

    public void initialize() {
        // fills in observable list with data
        data = new ContactData();
        data.loadContacts();
        table.setItems(data.getContacts());
//        firstNameColumn.setCellValueFactory(
//                new PropertyValueFactory<Contact, String>("firstName")
//        );
//        lastNameColumn.setCellValueFactory(
//                new PropertyValueFactory<Contact, String>("lastName")
//        );
//        phoneNumberColumn.setCellValueFactory(
//                new PropertyValueFactory<Contact, String>("phoneNumber")
//        );
//        notesColumn.setCellValueFactory(
//                new PropertyValueFactory<Contact, String>("notes")
//        );




    }
}
