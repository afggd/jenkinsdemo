package com.bolingcavalry.mavendockerplugindemo.dao.impl;

import com.bolingcavalry.mavendockerplugindemo.dao.BaseAuthorDao;
import com.bolingcavalry.mavendockerplugindemo.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * description
 *
 * @author zzq
 * @version 1.0
 * @className impl
 * @date 2019/4/28
 **/
@Repository
public class AuthorDao implements BaseAuthorDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Author author) {
        return jdbcTemplate.update("insert into t_author (id, name) values (?, ?); ", author.getId(), author.getName());
    }
}
