package com.javacheck.mybatis.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.javacheck.mybatis.entity.Paper_Courserclass;
import com.javacheck.mybatis.entity.RespPageEntity;
import com.javacheck.mybatis.mapper.Paper_CourserclassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: lijincan
 * @date: 2019年12月07日 16:57
 * @Description: TODO
 */
@Component
public class Paper_CourserclassServiceImpl extends ServiceImpl<Paper_CourserclassMapper,Paper_Courserclass> implements Paper_CourserclassService{

    @Autowired
    private Paper_CourserclassMapper paper_courserclassMapper;


}
