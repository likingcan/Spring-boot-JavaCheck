package com.javacheck.mybatis.service;

import com.baomidou.mybatisplus.service.IService;
import com.javacheck.mybatis.entity.Person;

public interface PersonService extends IService<Person> {

    Person checkLogin(String username,String password);
}
