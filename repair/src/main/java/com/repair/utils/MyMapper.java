package com.repair.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/*
* MyMapper工具类
* */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {


}
