package com.repair.service.Impl;

import com.repair.dao.CompleteOrderMapper;
import com.repair.entity.CompleteOrder;
import com.repair.exception.CompleteOrderIdIsNullException;
import com.repair.service.CompleteOrderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by SuperJJ on 2020/6/1 15:27
 */
@Service
public class CompleteOrderServiceImpl implements CompleteOrderService {

    @Autowired
    private CompleteOrderMapper completeOrderMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<CompleteOrder> searchAllCompleteOrder() {

        return completeOrderMapper.selectAll();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public CompleteOrder searchCompleteOrderById(Integer id) {

        if (StringUtils.isBlank(id.toString())) {
            throw new CompleteOrderIdIsNullException("传入的完成表单ID不能为空");
        }
        return completeOrderMapper.selectByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Integer getCompleteOrderCount() {
        return completeOrderMapper.getCompleteOrderCount();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<CompleteOrder> searchCompleteOrderByKeyWord(String keyWord) {
        return completeOrderMapper.getCompleteOrderByKeyWord(keyWord);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveCompleteOrder(CompleteOrder completeOrder) {

        completeOrderMapper.insertSelective(completeOrder);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public void updateCompleteOrder(CompleteOrder completeOrder) {

        completeOrderMapper.updateByPrimaryKeySelective(completeOrder);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public void deleteCompleteOrder(Integer id) {

        if (StringUtils.isBlank(id.toString())) {
            throw new CompleteOrderIdIsNullException("传入的用户名为空");
        }

        completeOrderMapper.deleteByPrimaryKey(id);
    }
}
