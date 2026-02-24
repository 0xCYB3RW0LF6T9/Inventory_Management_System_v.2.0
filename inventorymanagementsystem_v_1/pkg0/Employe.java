/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanagementsystem_v_1.pkg0;

/**
 *
 * @author CYB3R_W0LF
 */
public class Employe {
    private String name,designation,mobile,email,brach;

    public Employe(String name, String designation, String mobile, String email, String brach) {
        this.name = name;
        this.designation = designation;
        this.mobile = mobile;
        this.email = email;
        this.brach = brach;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getBrach() {
        return brach;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBrach(String brach) {
        this.brach = brach;
    }
    
    
    
    
    
    
}
