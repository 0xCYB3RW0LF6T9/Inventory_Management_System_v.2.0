/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package inventorymanagementsystem_v_1.pkg0;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author CYB3R_W0LF
 */
public class AddProductController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField idField;
    private TextField quantityFiled;
    @FXML
    private TextField quantityField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    static ObservableList<product>productList = FXCollections.observableArrayList();
    @FXML
    private void submitOnAction(ActionEvent event) throws IOException {
        String name = nameField.getText();
        String id =idField.getText();
        int quantity = Integer.parseInt(quantityField.getText());
        if(name.equals("") && id.equals(""))return;
        product pro =new product(name,id,quantity);
         
        File file = new File("Products.txt");
        if(!file.exists()) file.createNewFile();
        FileWriter fw= new FileWriter("Products.txt",true);
        fw.write(name+"#"+id+"#"+quantity+"\n");
        fw.close();
        
        
        productList.add(pro);
        
        nameField.clear();
        idField.clear();
        quantityField.clear();
       
    }

    @FXML
    private void resetOnAction(ActionEvent event) {
        nameField.setText("");
        idField.setText("");
       quantityField.clear();
        
    }
    
}
