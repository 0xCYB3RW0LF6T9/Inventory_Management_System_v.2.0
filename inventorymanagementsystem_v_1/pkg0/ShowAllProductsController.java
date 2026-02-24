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
public class ShowAllProductsController implements Initializable {

    @FXML
    private TableView<product> tableView;
    @FXML
    private TableColumn<product, String> nameCol;
    @FXML
    private TableColumn<product, String> idCOl;
    @FXML
    private TableColumn<product, Integer> quantityCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        tableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        nameCol.setCellValueFactory(new PropertyValueFactory<product, String>("name"));
        idCOl.setCellValueFactory(new PropertyValueFactory<product, String>("id"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<product, Integer>("quantity"));
        tableView.setItems(AddProductController.productList);
       
         File file = new File("Products.txt");

try {

    if (!file.exists()) {
        file.createNewFile();
    }

    // IMPORTANT: clear list to avoid duplicates
    AddProductController.productList.clear();

    Scanner sc = new Scanner(file);   

    while (sc.hasNextLine()) {
        String str = sc.nextLine();

        if (str.trim().isEmpty()) continue;

        String parts[] = str.split("#");

        if (parts.length == 3) {
            product pd = new product(
                    parts[0],
                    parts[1],
                    Integer.parseInt(parts[2])
            );

            AddProductController.productList.add(pd);
        }
    }

    sc.close();

} catch (Exception e) {
    e.printStackTrace();
}
          
          
          
            
            
        
        
        
        
        
// TODO
    }

    @FXML
    private void deleteOnAction(ActionEvent event) throws IOException {
        
        product pd=tableView.getSelectionModel().getSelectedItem();
        AddProductController.productList.remove(pd);
        File file = new File("Products.txt");
        FileWriter fw= new FileWriter(file);
        String str="";
        for(product s:AddProductController.productList)
        {
            str+=s.getName()+"#"+s.getId()+"#"+s.getQuantity()+"\n";
            
        }
        fw.write(str);
        fw.close();
        
        
    }

}
