package com.example.crud7.service;

import com.example.crud7.model.Employee;
import com.example.crud7.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    public Iterable<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }

    public Optional<Employee> findById(Long id) {
        return iEmployeeRepository.findById(id);
    }

    public Employee save(Employee customer) {
        return iEmployeeRepository.save(customer);
    }

    public void remove(Long id) {
        iEmployeeRepository.deleteById(id);
    }

    public Page<Employee> findAllPackage(Pageable pageable) {
        return iEmployeeRepository.findAll(pageable);
    }

    public List<Employee> findByName(String value) {
        return iEmployeeRepository.findByNameContainingIgnoreCase(value);
    }
}
