package com.repair.service;

import com.repair.entity.CompleteOrder;

import java.util.List;


/**
 * Created by SuperJJ on 2020/6/1 15:18
 */
public interface CompleteOrderService {

    /*
    *获取所有完成表单
    * @return
    * */
    List<CompleteOrder> searchAllCompleteOrder();

    /*
    * 获取完成维修表单数量
    * */
    Integer getCompleteOrderCount();

    /*
    * 通过表单ID获取表单信息
    * */
    CompleteOrder searchCompleteOrderById(Integer id);

    /*
    * 通过关键字搜索完成维修工单
    * */
    List<CompleteOrder> searchCompleteOrderByKeyWord(String KeyWord);

    /*
    * 保存完成表单信息
    * */
    void saveCompleteOrder(CompleteOrder completeOrder);

    /*
    * 更新完成表单信息
    * */
    void updateCompleteOrder(CompleteOrder completeOrder);

    /*
    * 删除完成表单信息
    * */
    void deleteCompleteOrder(Integer id);
}
