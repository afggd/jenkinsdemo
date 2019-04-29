package com.bolingcavalry.mavendockerplugindemo.controller;

import com.bolingcavalry.mavendockerplugindemo.domain.City;
import com.bolingcavalry.mavendockerplugindemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author zzq
 * @version 1.0
 * @className CityRestController
 * @date 2019/4/29
 **/
@RestController
public class CityRestController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }

}
