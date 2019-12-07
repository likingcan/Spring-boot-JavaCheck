package com.javacheck.mybatis.service;

import com.baomidou.mybatisplus.service.IService;
import com.javacheck.mybatis.entity.College;
import com.javacheck.mybatis.entity.RespPageEntity;

public interface CollegeService extends IService<College>{

    String GetCollegeNameById (Integer id);
}
