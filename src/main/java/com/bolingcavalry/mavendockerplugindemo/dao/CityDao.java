package com.bolingcavalry.mavendockerplugindemo.dao;

/**
 * description
 *
 * @author zzq
 * @version 1.0
 * @className CityDao
 * @date 2019/4/29
 **/

import com.bolingcavalry.mavendockerplugindemo.domain.City;
import org.springframework.stereotype.Component;

/**
 * 城市 DAO 接口类
 */
@Component
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(String cityName);//@Param("cityName")
}
