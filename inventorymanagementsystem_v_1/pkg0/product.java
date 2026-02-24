/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanagementsystem_v_1.pkg0;

/**
 *
 * @author CYB3R_W0LF
 */
public class product {
    private String name,id;
    private int quantity;

    public product(String name, String id, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
