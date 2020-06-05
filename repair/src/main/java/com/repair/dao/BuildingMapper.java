package com.repair.dao;

import com.repair.entity.Building;
import com.repair.utils.MyMapper;

public interface BuildingMapper extends MyMapper<Building> {

    Integer getBuildingCount();
}