package com.repair.dao;

import com.repair.entity.Orders;
import com.repair.utils.MyMapper;
import io.swagger.models.auth.In;

import java.util.List;

public interface OrdersMapper extends MyMapper<Orders> {
    List<Orders> getAllOrder();

    Orders getOrderById(Integer orderId);

    Integer getOrdersCount();

}