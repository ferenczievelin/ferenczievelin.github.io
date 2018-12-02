package com.example.demo.Service;

import com.example.demo.Model.Application;
import com.example.demo.Model.User;
import com.example.demo.Repo.AppRepo;
import com.example.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {

    private AppRepo appRepo;
    private UserRepo userRepo;
    @Autowired
    public void setAppRepo (AppRepo appRepo) {
        this.appRepo = appRepo;
    }
    @Autowired
    public void setUserRepo (UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getUsers() {
        return (List<User>) userRepo.findAll();
    }







}
