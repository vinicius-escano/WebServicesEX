package com.odnammoc.webservicesex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odnammoc.webservicesex.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
