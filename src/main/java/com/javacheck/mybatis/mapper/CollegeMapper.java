package com.javacheck.mybatis.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.javacheck.mybatis.entity.College;
import org.apache.ibatis.annotations.Param;

public interface CollegeMapper extends BaseMapper<College>{

    String GetCollegeNameById (@Param("page") Integer id);
}
