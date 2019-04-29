package com.bolingcavalry.mavendockerplugindemo.service;

/**
 * description
 *
 * @author zzq
 * @version 1.0
 * @className CityService
 * @date 2019/4/29
 **/

import com.bolingcavalry.mavendockerplugindemo.domain.City;

/**
 * 城市业务逻辑接口类
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}