package com.repair.dao;

import com.repair.entity.Administrator;
import com.repair.utils.MyMapper;

public interface AdministratorMapper extends MyMapper<Administrator> {
    Integer getAdministratorCount();
}