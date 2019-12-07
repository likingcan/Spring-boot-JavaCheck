package com.javacheck.mybatis.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.javacheck.mybatis.entity.TestPaper;
import com.javacheck.mybatis.entity.RespPageEntity;
import com.javacheck.mybatis.mapper.TestPaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: lijincan
 * @date: 2019年12月07日 16:59
 * @Description: TODO
 */
@Component
public class TestPaperServiceImpl extends ServiceImpl<TestPaperMapper,TestPaper> implements TestPaperService{

    @Autowired
    TestPaperMapper testPaperMapper;

    @Transactional
    public RespPageEntity getAllTestPaper(Integer page, Integer size) {
        RespPageEntity pageEntity = new RespPageEntity();
        // 默认从0开始
        if (page != null && size != null) {
            page = (page-1)*size;
        }
        // 获取考试信息
        List<TestPaper> paper_Courserclass =  testPaperMapper.getAllTestPaper(page, size);
        pageEntity.setData(paper_Courserclass);
        // 获取总量
        Long total = testPaperMapper.getTotal();
        pageEntity.setTotal(total);

        return pageEntity;
    }
}
