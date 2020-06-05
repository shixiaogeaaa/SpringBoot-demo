package com.repair.service;


import com.repair.entity.Orders;
import java.util.List;

/**
 * Created by SuperJJ on 2020/6/1 14:26
 */
public interface OrdersService {

    /*
    * 获取全部维修单
    * @return
    * */
    List<Orders> searchAllOrder();

    /*
    * 根据维修单号获取维修单
    * @param id
    * @return
    * */
    Orders searchOrderById(Integer id);

    /*
    *获取维修单数量
    * @return
    * */
    Integer getOrderCount();

    /*
    * 添加维修单
    * @oaram order
    *
    * */
    void saveOrder(Orders order);

    /*
    * 更新维修单
    * @param order
    * */
    void updateOrder(Orders order);

    /*
    * 删除维修单
    * @param id
    * */
    void deleteOrder(Integer id);
}
