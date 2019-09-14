package com.api.ArtValue.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
private  Long id;
private  String userName;
private  String email;
private  String password;
private  String fullName;
private  Long mobile;
private  Role role;
@OneToOne(mappedBy = "user" , cascade =  CascadeType.ALL)
private  Cart userCart;
//private  List<Product> productListHistory;
//private  List<Address> addressList;

}

