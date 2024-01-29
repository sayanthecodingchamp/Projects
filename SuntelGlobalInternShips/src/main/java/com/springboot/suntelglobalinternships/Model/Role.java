package com.springboot.suntelglobalinternships.Model;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import javax.persistence.*;

import java.util.UUID;

@Entity
@Table
public class Role {
    @Id
    @GeneratedValue
    private UUID rID;

    private String roleName;

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public Role(UUID rID, String roleName) {
        this.rID = rID;
        this.roleName = roleName;
    }

    public UUID getrID() {
        return rID;
    }

    public void setrID(UUID rID) {
        this.rID = rID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
