package com.example.demo.dao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;

@CrossOrigin("http://localhost:4200")

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query
	Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
	
	@Query
    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}