/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package inventorymanagementsystem_v_1.pkg0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author CYB3R_W0LF
 */
public class AllEmployeeController implements Initializable {

    @FXML
    private TableColumn<Employe, String> nameField;
    @FXML
    private TableColumn<Employe, String> designationField;
    @FXML
    private TableColumn<Employe, String> mobileField;
    @FXML
    private TableColumn<Employe, String> emailField;
    @FXML
    private TableColumn<Employe, String> branchField;
    @FXML
    private TableView<Employe> tableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       tableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        nameField.setCellValueFactory(new PropertyValueFactory<Employe,String>("name"));
        designationField.setCellValueFactory(new PropertyValueFactory<Employe,String>("designation"));
        mobileField.setCellValueFactory(new PropertyValueFactory<Employe,String>("mobile"));
        emailField.setCellValueFactory(new PropertyValueFactory<Employe,String>("email"));
        branchField.setCellValueFactory(new PropertyValueFactory<Employe,String>("brach"));
        
        tableView.setItems(EmployeeController.list);
        EmployeeController.list.clear();
        File file = new File("data_employee.txt");
      if(!file.exists()) try {
          file.createNewFile();
        } catch (IOException ex) {
            System.getLogger(AllEmployeeController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
      Scanner sc = null;
        try {
            sc = new Scanner (file);
        } catch (FileNotFoundException ex) {
            System.getLogger(AllEmployeeController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
      while(sc.hasNext())
      {
          String str="";
          str=sc.nextLine();
         String sa[]= str.split("#");
         Employe em = new Employe(sa[0],sa[1],sa[2],sa[3],sa[4]);
         
          EmployeeController.list.add(em);
          
          
      }
        
        
    }    

    @FXML
    private void deleteOnAction(ActionEvent event) throws IOException {
        Employe em= tableView.getSelectionModel().getSelectedItem();
        EmployeeController.list.remove(em);
        String str="";
        File file = new File("data_employee.txt");
        if(!file.exists()) file.createNewFile();
        
        FileWriter fw= new FileWriter(file);
      for(Employe a :EmployeeController.list )
      {
          str+=a.getName()+"#"+a.getDesignation()+"#"+a.getMobile()+"#"+a.getEmail()+"#"+a.getBrach()+"\n";
      }
        fw.write(str);
        fw.close();
        
        
    }
    
}
