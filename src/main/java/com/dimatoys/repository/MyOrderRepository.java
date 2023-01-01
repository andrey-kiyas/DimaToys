package com.dimatoys.repository;

import com.dimatoys.model.MyOrder;
import org.springframework.data.repository.CrudRepository;

public interface MyOrderRepository extends CrudRepository<MyOrder, String> {
}
