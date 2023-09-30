package com.online.stores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.stores.entity.Product;

public interface ProductAdmRepository extends JpaRepository<Product, Long> {
}
