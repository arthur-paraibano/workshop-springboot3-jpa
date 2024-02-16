package com.exercicoarthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicoarthur.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
