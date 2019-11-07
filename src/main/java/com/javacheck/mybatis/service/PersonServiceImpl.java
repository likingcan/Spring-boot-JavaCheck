package com.javacheck.mybatis.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.javacheck.mybatis.entity.Person;
import com.javacheck.mybatis.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person>
        implements PersonService  {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public Person checkLogin(String username, String password) {

        return personMapper.checkLogin(username,password);
    }
}
