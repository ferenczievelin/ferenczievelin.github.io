package com.example.demo.Model;

import javax.persistence.*;

import java.util.List;

@Entity
@Table
public class Application  {


    @Id
    @GeneratedValue
    private Long appId;

    private String name;


    @ManyToMany
    public List<User> users;



    public Application(String name, List<User> users) {
        this.users = users;
        this.name = name;
    }

    private Application() {
    }


    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }



}
