package br.com.estoque.dasa.modules.products.service;

import br.com.estoque.dasa.modules.products.entity.Product;
import br.com.estoque.dasa.modules.products.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> listAll() {
        return this.repository.findAll();
    }

    public Optional<Product> findOne(String id) {
        Optional<Product> product = this.repository.findById(id);
        if(product.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND," id não encontrado.");
        }
        return product;
    }

    public Product create(Product product) {
        return repository.save(product);
    }

    public Product update(String id, Product product) {
        Optional<Product> exist = findOne(id);
        if (exist.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Produto não encontrado");
        }


    }

    public Optional<Product> delete(String id) {
       Optional<Product> exist = findOne(id);
        if (exist.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"id não encontrado");
        }
        Product deleted = repository.delete(exist);
        return Optional.ofNullable(deleted);
    }



}
