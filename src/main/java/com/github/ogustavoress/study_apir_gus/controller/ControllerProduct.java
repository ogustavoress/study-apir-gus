package com.github.ogustavoress.study_apir_gus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.ogustavoress.study_apir_gus.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<String> create(){
        productService.create(null);
        return ResponseEntity.status(201).body("Product created.");
    }
    @GetMapping
    public ResponseEntity<String> read(){
        productService.getById(null);
        return ResponseEntity.status(200).body("Mango");
    }
    @PutMapping
    public ResponseEntity<String> update(){
        productService.update(null, null);
        return ResponseEntity.status(200).body("Product updated");
    }
    @DeleteMapping
    public ResponseEntity<Void> delete(){
        productService.delete();
        return ResponseEntity.status(204).build();
    }

}
