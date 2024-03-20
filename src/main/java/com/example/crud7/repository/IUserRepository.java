package com.example.crud7.repository;

import com.example.crud7.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User getUserByUsername(String userName);
}
