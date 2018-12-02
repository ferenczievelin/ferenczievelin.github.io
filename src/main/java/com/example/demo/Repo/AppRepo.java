package com.example.demo.Repo;

import com.example.demo.Model.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepo extends CrudRepository<Application, Long> {

}
