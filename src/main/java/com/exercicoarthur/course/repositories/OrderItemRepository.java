package com.exercicoarthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicoarthur.course.entites.OrderItem;
import com.exercicoarthur.course.entites.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
