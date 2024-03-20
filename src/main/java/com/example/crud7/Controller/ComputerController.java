package com.example.crud7.Controller;


import com.example.crud7.model.Computer;
import com.example.crud7.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/computers")
public class ComputerController {
    @Autowired
    private ComputerService computerService;

    @GetMapping
    public List<Computer> getAllComputers() {
        return computerService.getAllComputers();
    }
    @GetMapping("/package")
    public ResponseEntity<Page<Computer>> getAllComputerAndPack(Pageable pageable){
        return ResponseEntity.ok(computerService.getAllComputer(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Computer> getComputerById(@PathVariable Long id) {
        Computer computer = computerService.getComputerById(id);
        return computer != null ? ResponseEntity.ok(computer) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Computer> createComputer(@Valid @RequestBody Computer computer) {
        System.out.println(computer);
        Computer savedComputer = computerService.saveComputer(computer);
        return new ResponseEntity<>(savedComputer, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Computer> updateComputer(@PathVariable Long id, @Valid @RequestBody Computer computer) {
        if (!computerService.getComputerById(id).equals(computer)) {
            return ResponseEntity.badRequest().build();
        }
        Computer updatedComputer = computerService.saveComputer(computer);
        return ResponseEntity.ok(updatedComputer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComputer(@PathVariable Long id) {
        computerService.deleteComputer(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Computer>> searchComputersByName(@RequestParam String value) {
        List<Computer> computers = computerService.searchComputersByName(value);
        return ResponseEntity.ok(computers);
    }

}