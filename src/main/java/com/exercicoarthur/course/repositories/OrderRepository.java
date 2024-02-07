package com.exercicoarthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicoarthur.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
