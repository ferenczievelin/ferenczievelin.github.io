package com.example.demo.Repo;

import com.example.demo.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends CrudRepository<User, Long> {

}
