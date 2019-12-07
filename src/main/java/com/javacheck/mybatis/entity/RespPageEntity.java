package com.javacheck.mybatis.entity;

import lombok.Data;

import java.util.List;

/**
 * @author lijincan
 * @DESCRIPTION 分页传值类
 */
@Data
public class RespPageEntity {
    private List<?> data;
    private Long total;
}
