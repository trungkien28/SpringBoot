package com.example.springboot05.repository;

import com.example.springboot05.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    @Query("SELECT u FROM User u where u.name like?1")
    List<User> searchByName(String name);
}
