/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package inventorymanagementsystem_v_1.pkg0;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
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
public class EmployeeController implements Initializable {

    @FXML
    private TextField nameEmployee;
    @FXML
    private TextField designaiton;
    @FXML
    private TextField mobileEmployee;
    @FXML
    private TextField emailEmploye;
    @FXML
    private TextField branchEmploye;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    static ObservableList<Employe> list = FXCollections.observableArrayList();
    @FXML
    private void submitOnAction(ActionEvent event) throws IOException {
       String name,post,mobile,email,branch;
      name=nameEmployee.getText();
      post=designaiton.getText();
      mobile=mobileEmployee.getText();
      email=emailEmploye.getText();
      branch=branchEmploye.getText();
      
      Employe em = new Employe(name,post,mobile,email,branch);
      list.add(em);
      
      File file = new File("data_employee.txt");
      if(!file.exists()) file.createNewFile();
      FileWriter fw=new FileWriter(file,true);
      
      fw.write(name+"#"+post+"#"+mobile+"#"+email+"#"+branch+"\n");
      fw.close();
      
      
      nameEmployee.clear();
      designaiton.clear();
      mobileEmployee.clear();
      emailEmploye.clear();
      branchEmploye.clear();
      
      
        
        
    }

    @FXML
    private void resetOnAction(ActionEvent event) {
        nameEmployee.clear();
      designaiton.clear();
      mobileEmployee.clear();
      emailEmploye.clear();
      branchEmploye.clear();
      
    }
    
}
