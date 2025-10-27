package com.example.helloworld.helloworld.repository;

import com.example.helloworld.helloworld.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,String> {
    Optional<Product> findByName(String name);

    List<Product> findByCategoryIdAndSubCategoryId(String categoryId, String subCategoryId);

    List<Product> findByCategoryId(String categoryId);
}
