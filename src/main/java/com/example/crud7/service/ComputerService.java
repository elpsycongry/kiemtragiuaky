package com.example.crud7.service;

import com.example.crud7.model.Computer;
import com.example.crud7.repository.IComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

@Service
@Validated
public class ComputerService {
    @Autowired
    private IComputerRepository computerRepository;

    // Các phương thức CRUD đã được triển khai ở trên
    public List<Computer> getAllComputers() {
        return computerRepository.findAll();
    }

    public Page<Computer> getAllComputer(Pageable pageable) {
        return computerRepository.findAll(pageable);
    }

    public Computer getComputerById(Long id) {
        return computerRepository.findById(id).orElse(null);
    }

    public Computer saveComputer(@Valid Computer computer) {
        return computerRepository.save(computer);
    }

    public void deleteComputer(Long id) {
        computerRepository.deleteById(id);
    }

    public List<Computer> searchComputersByName(String name) {
        return computerRepository.findByNameContainingIgnoreCase(name);
    }

}