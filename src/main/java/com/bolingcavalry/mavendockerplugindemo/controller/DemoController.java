package com.bolingcavalry.mavendockerplugindemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.bolingcavalry.mavendockerplugindemo.domain.Author;
import com.bolingcavalry.mavendockerplugindemo.service.impl.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author zzq
 * @version 1.0
 * @className DemoController
 * @date 2019/4/28
 **/
@RestController
@RequestMapping(value="/data/jdbc/author")
public class DemoController {

    @Autowired
    private AuthorService authorService;

    /**
     * 新增方法
     */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody JSONObject jsonObject) {
        String id = jsonObject.getString("id");
        String name = jsonObject.getString("name");
        Author author = new Author();
        if (author != null) {
            author.setId(Long.valueOf(id));
        }
        author.setName(name);
        try {
            this.authorService.add(author);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("新增错误");
        }
    }

}