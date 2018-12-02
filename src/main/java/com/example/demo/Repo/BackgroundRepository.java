package com.example.demo.Repo;

import com.example.demo.Model.Background;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackgroundRepository extends CrudRepository<Long, Background> {
}
