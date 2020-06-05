package com.repair.service;

import com.repair.entity.Class;

import java.util.List;

/**
 * Created by SuperJJ on 2020/6/1 15:44
 */
public interface ClassService {

    /*
    * 获取全部机房信息
    * @return
    * */
    List<Class> searchAllClass();

    /*
    * 通过机房ID获取机房信息
    * @param id
    * @return
    * */
    Class searchClassById(Integer id);

    /*
    * 通过机房名称获取机房信息
    * @param name
    * @return
    * */
    List<Class> searchClassByName(String name);

    /*
    * 通过楼ID获取机房信息
    * @param buildingId
    * @return
    * */
    List<Class> searchClassByBuildingId(String buildingId);

    /*
    * 获取教室数量
    * */
    Integer getClassCount();

    /*
    * 保存机房信息
    * @param classes
    * */
    void saveClass(Class classes);

    /*
    * 更新机房信息
    * @param classes
    * */
    void updateClass(Class classes);

    /*
    * 删除机房信息
    * @param id
    * */
    void deleteClass(Integer id);

    /*
    * 增加实验室可用电脑
    * @param id
    * */
    void increaseComputerEnable(Integer id);

    /*
     * 减少实验室可用电脑
     * @param id
     * */
    void reduceComputerEnable(Integer id);
}
