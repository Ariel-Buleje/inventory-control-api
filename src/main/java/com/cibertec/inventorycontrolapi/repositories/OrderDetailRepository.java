package com.cibertec.inventorycontrolapi.repositories;

import com.cibertec.inventorycontrolapi.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
