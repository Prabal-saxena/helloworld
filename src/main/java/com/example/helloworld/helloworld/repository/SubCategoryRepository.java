package com.example.helloworld.helloworld.repository;

import com.example.helloworld.helloworld.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory, String> {

    List<SubCategory> findByCategoryId(String categoryId);
}
