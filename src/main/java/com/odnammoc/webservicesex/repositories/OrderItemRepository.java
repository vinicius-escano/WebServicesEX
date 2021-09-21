package com.odnammoc.webservicesex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odnammoc.webservicesex.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
