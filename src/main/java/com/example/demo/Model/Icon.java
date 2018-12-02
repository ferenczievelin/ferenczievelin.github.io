package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Icon {


    @Id
    @Column(name = "icon_id", unique = true)
    @GeneratedValue
    private Long iconId;

    @Column
    private String name;

    public Icon(String name) {
        this.name = name;
    }
    public Long getIconId() {
        return iconId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
