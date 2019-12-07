package com.javacheck.mybatis.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import java.util.Date;


/**
 * @author: lijincan
 * @date: 2019年12月07日 10:57
 * @Description: 试卷类
 */
@TableName("kh_testpaper")
@Data
public class TestPaper {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    private String name;
    private int type_id;
    private int college_id;
    private int lession_id;
    private int full_score;
    private int pass_score;
    private int is_use;
    private Date create_date;
    private String create_by;
    private Date update_date;
    private String update_by;
    private String comment;
    private String del_flag;
}
