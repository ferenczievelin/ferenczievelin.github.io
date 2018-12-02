package com.example.demo.Controllers;

import com.example.demo.Model.User;
import com.example.demo.Repo.AppRepo;
import com.example.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    private final UserRepo userRepo;
    private final AppRepo appRepo;

    @Autowired
    public AppController(UserRepo userRepo, AppRepo appRepo) {
        this.userRepo = userRepo;
        this.appRepo = appRepo;
    }





}
