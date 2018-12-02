package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Background {
    @Id
    @GeneratedValue
    private Long bgId;

   private String bg ;


}
