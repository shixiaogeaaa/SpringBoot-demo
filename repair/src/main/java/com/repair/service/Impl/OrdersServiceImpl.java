package com.repair.service.Impl;

import com.repair.dao.OrdersMapper;
import com.repair.entity.Orders;
import com.repair.exception.OrderIdIsNullException;
import com.repair.service.OrdersService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by SuperJJ on 2020/6/1 14:35
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersMapper ordersMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Orders> searchAllOrder() {

        return ordersMapper.getAllOrder();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Orders searchOrderById(Integer id) {

        if (StringUtils.isBlank(id.toString())) {
            throw new OrderIdIsNullException("传入的订单ID为空");
        }
        return ordersMapper.getOrderById(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Integer getOrderCount() {
        return ordersMapper.getOrdersCount();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveOrder(Orders order) {

        ordersMapper.insertSelective(order);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateOrder(Orders order) {

        ordersMapper.updateByPrimaryKeySelective(order);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deleteOrder(Integer id) {

        if (StringUtils.isBlank(id.toString())) {
            throw new OrderIdIsNullException("传入的订单ID为空");
        }
        ordersMapper.deleteByPrimaryKey(id);
    }
}

