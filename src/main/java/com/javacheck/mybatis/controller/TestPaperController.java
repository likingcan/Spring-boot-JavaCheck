package com.javacheck.mybatis.controller;

import com.javacheck.mybatis.entity.RespPageEntity;
import com.javacheck.mybatis.service.Paper_CourserclassService;
import com.javacheck.mybatis.service.TestPaperService;
import com.javacheck.mybatis.util.ResultGenerator;
import com.javacheck.mybatis.entity.Person;
import com.javacheck.mybatis.entity.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolationException;
import javax.validation.constraints.NotNull;
@RestController
@RequestMapping("testpaper")
public class TestPaperController {

    @Autowired
    private ResultGenerator resultGenerator;
    @Autowired
    private Paper_CourserclassService paper_courserclassService;
    @Autowired
    private TestPaperService testPaperService;


    @GetMapping("/page/")
    public RespPageEntity getAllUserByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer size) {

        System.out.println(page);
        RespPageEntity respPageEntity = testPaperService.getAllTestPaper(page, size);
        System.out.println("共"+respPageEntity.getTotal()+"条数据");
        return respPageEntity;
    }

    /**
     * 为参数验证添加异常处理器
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public RestResult handleConstraintViolationException(ConstraintViolationException cve) {
        //这里简化处理了，cve.getConstraintViolations 会得到所有错误信息的迭代，可以酌情处理
        String errorMessage = cve.getConstraintViolations().iterator().next().getMessage();
        return resultGenerator.getFailResult(errorMessage);
    }
}
