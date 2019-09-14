package com.api.ArtValue.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
public class User {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long id;
private  String userName;
private  String email;
private  String password;
private  String fullName;
private  Long mobile;
//private  Role role;
//private  Cart userCart;
//private  List<Product> productListHistory;
//private  List<Address> addressList;

}

