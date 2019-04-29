package com.bolingcavalry.mavendockerplugindemo.controller;

import com.bolingcavalry.mavendockerplugindemo.domain.DemoProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author zzq
 * @version 1.0
 * @className PropertiesController
 * @date 2019/4/29
 **/
@RequestMapping("/demo")
@RestController
public class PropertiesController {
    private static final Logger log = LoggerFactory.getLogger(PropertiesController.class);

    private final DemoProperties demoProperties;

    @Autowired
    public PropertiesController(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    @GetMapping("/1")
    public DemoProperties myProperties1() {
        log.info("=================================================================================================");
        log.info(demoProperties.toString());
        log.info("=================================================================================================");
        return demoProperties;
    }

}
