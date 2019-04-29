package com.bolingcavalry.mavendockerplugindemo.service.impl;

/**
 * description
 *
 * @author zzq
 * @version 1.0
 * @className CityServiceImpl
 * @date 2019/4/29
 **/

import com.bolingcavalry.mavendockerplugindemo.dao.CityDao;
import com.bolingcavalry.mavendockerplugindemo.domain.City;
import com.bolingcavalry.mavendockerplugindemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
