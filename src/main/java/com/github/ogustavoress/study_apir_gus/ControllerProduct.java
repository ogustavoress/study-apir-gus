package com.github.ogustavoress.study_apir_gus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ControllerProduct {

    @PostMapping
    public ResponseEntity<String> create(){
        return ResponseEntity.status(201).body("Product created.");
    }
    @GetMapping
    public ResponseEntity<String> read(){
        return ResponseEntity.status(200).body("Mango");
    }
    @PutMapping
    public ResponseEntity<String> update(){
        return ResponseEntity.status(200).body("Product updated");
    }
    @DeleteMapping
    public ResponseEntity<Void> delete(){
        return ResponseEntity.status(204).build();
    }

}
