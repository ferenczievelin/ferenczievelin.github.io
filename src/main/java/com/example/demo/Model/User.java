package com.example.demo.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class User {
    @Id
    @GeneratedValue
   private Long userId;

    private String name;



    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "UserApp",
            joinColumns = { @JoinColumn(name = "UserId") },
            inverseJoinColumns = { @JoinColumn(name = "AppId") }
    )

    private List<Application> applications = new ArrayList<Application>() {};

    @OneToOne
    private Icon icon;

    @OneToOne
    private Background bg;



    public User(String name, List<Application> applications, Background bg) {
        this.name = name;
        this.applications = applications;

        this.bg = bg;
    }

    private User() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }


}
