/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package inventorymanagementsystem_v_1.pkg0;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author CYB3R_W0LF
 */
public class FirstController implements Initializable {

    @FXML
    private BorderPane main;
    @FXML
    private VBox mainContent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Parent pane = null;
        try {
            pane = FXMLLoader.load(getClass().getResource("addProduct.fxml"));
            mainContent.getChildren().add(pane);
            
            
        } catch (IOException ex) {
            System.getLogger(FirstController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        //mainContent.getChildren().setAll(pane);
    }    
    @FXML
    private void addProductOnAction(ActionEvent event) throws IOException {
         Parent pane=FXMLLoader.load(getClass().getResource("addProduct.fxml"));
          mainContent.getChildren().setAll(pane);  
            
    }

    @FXML
    private void viewAllProductOnAction(ActionEvent event) throws IOException {
      Parent pane=FXMLLoader.load(getClass().getResource("showAllProducts.fxml"));
          mainContent.getChildren().setAll(pane);  
        
        
        
    }

    @FXML
    private void addemployeeOnAction(ActionEvent event) throws IOException {
   
    Parent pane=FXMLLoader.load(getClass().getResource("Employee.fxml"));
    mainContent.getChildren().setAll(pane);
    
    
    
    }

    @FXML
    private void allEmployeeOnAction(ActionEvent event) throws IOException {
    
    Parent pane = FXMLLoader.load(getClass().getResource("allEmployee.fxml"));
    mainContent.getChildren().setAll(pane);
            
    }

    
}
