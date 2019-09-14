package com.api.ArtValue.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
public class Cart {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 //   private User user;
//    private List<Product> products;
    private Long total;

}
