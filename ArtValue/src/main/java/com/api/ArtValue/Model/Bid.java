package com.api.ArtValue.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Map;

@Entity
@Data
public class Bid {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long id;
//private  Product product;
private  Date startDate;
private  Date endDate;
private  boolean sold;
//private  Map<User, Long> bidInfo;

}
