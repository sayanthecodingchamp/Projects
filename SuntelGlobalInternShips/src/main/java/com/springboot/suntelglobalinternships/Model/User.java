package com.springboot.suntelglobalinternships.Model;

//import jakarta.persistence.*;
//import jakarta.persistence.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    @Column(name = "User_Id")
    private UUID uId;

    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Address")
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
     private Role role;

    public User() {
    }

    public User(UUID uId) {
        this.uId = uId;
    }

    public User(String firstName, String lastName, String email, String password, String phone, String address, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public User(UUID uId, String firstName, String lastName, String email, String password, String phone, String address, Role role) {
        this.uId = uId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getuId() {
        return uId;
    }

    public void setuId(UUID uId) {
        this.uId = uId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
