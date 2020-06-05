package com.repair.service.Impl;

import com.repair.dao.BuildingMapper;
import com.repair.entity.Building;
import com.repair.exception.BuildingIdIsNullException;
import com.repair.exception.BuildingNameIsNullException;
import com.repair.service.BuildingService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by SuperJJ on 2020/6/1 16:13
 */
@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    BuildingMapper buildingMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Building> searchAllBuilding() {
        return buildingMapper.selectAll();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Building searchBuildingById(Integer id) {
        if (StringUtils.isBlank(id.toString())) {
            throw new BuildingIdIsNullException("传入的教学楼ID为空");
        }
        return buildingMapper.selectByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Building> searchBuildingByName(String name) {

        if (StringUtils.isBlank(name)) {
            throw new BuildingNameIsNullException("传入的教学楼名称为空");
        }

        Example example = new Example(Building.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("buildingName", "%" + name + "%");
        return buildingMapper.selectByExample(example);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Integer getBuildingCount() {
        return buildingMapper.getBuildingCount();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void savBuilding(Building building) {
        buildingMapper.insert(building);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateBuilding(Building building) {

        if (StringUtils.isBlank(building.getBuildingId().toString())) {
            throw new BuildingIdIsNullException("传入的教学楼ID为空");
        }
        buildingMapper.updateByPrimaryKeySelective(building);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deleteBuilding(Integer id) {

        if (StringUtils.isBlank(id.toString())) {
            throw new BuildingIdIsNullException("传入的教学楼ID为空");
        }
        buildingMapper.deleteByPrimaryKey(id);
    }
}

