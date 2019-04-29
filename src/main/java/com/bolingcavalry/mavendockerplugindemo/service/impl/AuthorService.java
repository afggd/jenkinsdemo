package com.bolingcavalry.mavendockerplugindemo.service.impl;

import com.bolingcavalry.mavendockerplugindemo.dao.impl.AuthorDao;
import com.bolingcavalry.mavendockerplugindemo.domain.Author;
import com.bolingcavalry.mavendockerplugindemo.service.BaseAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author zzq
 * @version 1.0
 * @className AuthorService
 * @date 2019/4/28
 **/
@Service
public class AuthorService implements BaseAuthorService {


    @Autowired
    private AuthorDao authorDao;


//    public int add(Long id){
//        return authorDao.add(id);
//    }

    @Override
    public int add(Author author) {
        return authorDao.add(author);
    }
}
