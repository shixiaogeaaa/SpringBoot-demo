package com.repair.service;

import com.repair.entity.Administrator;

import java.util.List;

public interface AdministratorService {

    /*
    * 查找所有管理员
    * */
    List<Administrator> searchAllAdministrator();

    /*
    * 统计管理员的人数
    * */
    String countAllAdministrator();

    /*
    * 根据管理员的ID查找
    * */
    Administrator searchAdministratorById(Integer id);

    /*
    * 根据管理员的名字查找
    * */
    List<Administrator> searchAdministratorByName(String name);

    /*
    * 根据管理员的手机号查找
    * */
    Administrator searchAdministratorByPhoneNum(String phoneNum);

    /*
    * 管理员登陆
    * */
    Administrator loginAdministrator(String phone,String password);

    /*
    * 判断管理员的手机号是否存在
    * */
    boolean administratorPhoneNumberIsExist(String number);

    /*
    * 添加管理员
    * */
    void saveAdministrator(Administrator admin);

    /**
     * 修改管理员
     *
     * @param admin
     */
    void updateAdministrator(Administrator admin);

    /*
    * 删除管理员
    * */
    void deleteAdministrator(Integer id);

}
