package com.example.demo;

import com.example.demo.Repo.AppRepo;
import com.example.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    final UserRepo userRepo;
    final AppRepo appRepo;

    @Autowired
    public DemoApplication(AppRepo appRepo, UserRepo userRepo) {
        this.appRepo = appRepo;
        this.userRepo = userRepo;

    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


    }


    @Override
    public void run(String... args) throws Exception {




    }
}
