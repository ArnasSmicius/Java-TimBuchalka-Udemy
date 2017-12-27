package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.datamodel.ContactData;

public class Main extends Application {

//    ContactData database = new ContactData();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("My Contacts");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

//    @Override
//    public void init() throws Exception {
//        database.loadContacts();
//    }
//
//    @Override
//    public void stop() throws Exception {
//        System.out.println(database.getContacts());
//        database.saveContacts();
//    }
}
