package com.example.crud7.repository;

import com.example.crud7.model.Computer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IComputerRepository extends JpaRepository<Computer , Long> {
    List<Computer> findByNameContainingIgnoreCase(String name);
}
