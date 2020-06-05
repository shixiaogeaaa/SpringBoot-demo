package com.repair.service.Impl;

import com.repair.dao.RoleMapper;
import com.repair.entity.Role;
import com.repair.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by SuperJJ on 2020/5/31 21:08
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Role> searchAllRole() {
        return roleMapper.selectAll();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Role searchRoleById(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }
}

