package br.com.estoque.dasa.modules.products.repository;

import br.com.estoque.dasa.modules.products.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, String> {
    Product delete(Optional<Product> exist);
}
