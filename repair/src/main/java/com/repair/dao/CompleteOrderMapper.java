package com.repair.dao;

import com.repair.entity.CompleteOrder;
import com.repair.utils.MyMapper;

import java.util.List;

public interface CompleteOrderMapper extends MyMapper<CompleteOrder> {

    List<CompleteOrder> getCompleteOrderByKeyWord(String KeyWord);

    Integer getCompleteOrderCount();


}