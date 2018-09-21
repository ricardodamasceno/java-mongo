package com.mongo.repository;

import com.mongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String>{

    public User findByName(String name);
    public List<User> findByLastName(String lastName);

}
