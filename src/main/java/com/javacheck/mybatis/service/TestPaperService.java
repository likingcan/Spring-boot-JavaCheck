package com.javacheck.mybatis.service;

import com.baomidou.mybatisplus.service.IService;
import com.javacheck.mybatis.entity.TestPaper;
import com.javacheck.mybatis.entity.RespPageEntity;

public interface TestPaperService extends IService<TestPaper>{

    RespPageEntity getAllTestPaper(Integer page, Integer size);

}
