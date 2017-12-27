package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField nameField;
    @FXML
    private Button increase;
    @FXML
    private Button decrease;

    @FXML
    public void onButtonClicked(ActionEvent e) {
        int counter = Integer.parseInt(nameField.getText());
        if (e.getSource().equals(increase)) {
            counter++;
        } else {
            counter--;
        }
        nameField.setText(Integer.toString(counter));
    }


}
