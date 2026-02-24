/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package inventorymanagementsystem_v_1.pkg0;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author CYB3R_W0LF
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Label screen;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loginOnAction(ActionEvent event) throws IOException {

        String s1 = usernameField.getText();
        String s2 = passwordField.getText();
        if (s1.equals("admin") && s2.equals("root")) {
            Parent pane = FXMLLoader.load(getClass().getResource("first.fxml"));
            Scene scene= new Scene(pane);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setWidth(620);
            stage.setHeight(720);
            stage.show();
            InventoryManagementSystem_v_10.stage.close();
            
            
        }
        else{
        screen.setText("Wrong Username or Password");
        }
    }

}
