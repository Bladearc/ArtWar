package com.api.ArtValue.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Product {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private Long price;
private Date age;
private Integer rating;//max 5 stars
//private User user; //Artist Details
private String description;

}
