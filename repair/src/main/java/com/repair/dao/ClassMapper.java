package com.repair.dao;

import com.repair.entity.Class;
import com.repair.utils.MyMapper;

import java.util.List;


public interface ClassMapper extends MyMapper<Class> {
    List<Class> getAllClass();

    Class getClassById(Integer id);

    List<Class> getClassByName(String name);

    List<Class> getClassByBuildingId(String buildingId);

    Integer getClassCount();
}