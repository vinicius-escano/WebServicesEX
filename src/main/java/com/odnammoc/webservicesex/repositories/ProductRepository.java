package com.odnammoc.webservicesex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odnammoc.webservicesex.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
