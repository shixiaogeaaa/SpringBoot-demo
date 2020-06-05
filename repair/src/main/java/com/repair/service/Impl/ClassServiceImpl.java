package com.repair.service.Impl;

import com.repair.dao.ClassMapper;
import com.repair.entity.Class;
import com.repair.exception.BuildingIdIsNullException;
import com.repair.exception.ClassIdIsNullException;
import com.repair.exception.ClassNameIsNullException;
import com.repair.service.ClassService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by SuperJJ on 2020/6/1 15:57
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Class> searchAllClass() {
        return classMapper.getAllClass();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Class searchClassById(Integer id) {

        if (StringUtils.isBlank(id.toString())) {
            throw new ClassIdIsNullException("传入的实训室ID为空");
        }
        return classMapper.getClassById(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Class> searchClassByName(String name) {
        if (StringUtils.isBlank(name)) {
            throw new ClassNameIsNullException("传入的实训室名称为空");
        }

        return classMapper.getClassByName(name);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Class> searchClassByBuildingId(String buildingId) {
        if (StringUtils.isBlank(buildingId)) {
            throw new BuildingIdIsNullException("传入的实训楼ID不能为空");
        }
        return classMapper.getClassByBuildingId(buildingId);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Integer getClassCount() {
        return classMapper.getClassCount();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveClass(Class classes) {
        classMapper.insertSelective(classes);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateClass(Class classes) {
        if (StringUtils.isBlank(classes.getClassId().toString())) {
            throw new ClassIdIsNullException("传入的实训室ID为空");
        }
        classMapper.updateByPrimaryKeySelective(classes);

    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deleteClass(Integer id) {
        if (StringUtils.isBlank(id.toString())) {
            throw new ClassIdIsNullException("传入的实训室ID为空");
        }
        classMapper.deleteByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void increaseComputerEnable(Integer classId) {

        Class classes = classMapper.getClassById(classId);
        Integer computerEnable = classes.getComputerEnable() + 1;
        Integer computerDisable = classes.getComputerDisable() - 1;
        classes.setComputerEnable(computerEnable);
        classes.setComputerDisable(computerDisable);
        classMapper.updateByPrimaryKeySelective(classes);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void reduceComputerEnable(Integer classId) {

        Class classes = classMapper.getClassById(classId);
        Integer computerEnable = classes.getComputerEnable() - 1;
        Integer computerDisable = classes.getComputerDisable() + 1;
        classes.setBuildingName(null);
        classes.setComputerEnable(computerEnable);
        classes.setComputerDisable(computerDisable);
        classMapper.updateByPrimaryKeySelective(classes);
    }
}
