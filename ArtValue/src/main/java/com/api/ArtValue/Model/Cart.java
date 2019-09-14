package com.api.ArtValue.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Cart {

    @Id
    @Column(name = "id")
    private Long id;

    @OneToOne
    @MapsId
    private User user;

//  private List<Product> products;
    private Long total;

}
