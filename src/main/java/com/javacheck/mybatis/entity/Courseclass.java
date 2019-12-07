package com.javacheck.mybatis.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import java.util.Date;
/**
 * @author: lijincan
 * @date: 2019年12月07日 16:26
 * @Description: TODO
 */
@TableName("kh_courserclass")
@Data
public class Courseclass {

    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    private String name;
    private int teacher_id;
    private int college_id;
    private int lession_id;
    private int grade_id;
    private String start_time;
    private String end_time;
    private String create_by;
    private Date create_date;
    private String update_by;
    private Date update_date;
    private String remarks;
    private String status;
    private String del_flag;
}
