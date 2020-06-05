package com.repair.service;

import com.repair.entity.Role;

import java.util.List;

/**
 * Created by SuperJJ on 2020/5/31 21:07
 * 角色信息类
 */
public interface RoleService {

    /**
     * 获得全部角色信息
     * @return
     */
    List<Role> searchAllRole();

    /**
     * 通过角色ID获取角色信息
     * @param id
     * @return
     */
    Role searchRoleById(Integer id);
}
