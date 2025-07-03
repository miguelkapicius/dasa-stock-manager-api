package br.com.estoque.dasa.modules.products.controller;

import br.com.estoque.dasa.modules.products.entity.Product;
import br.com.estoque.dasa.modules.products.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> listAll() {
        return this.service.listAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> findOne(@PathVariable String id) {
        return this.service.findOne(id);
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return this.service.create(product);
    }


}
