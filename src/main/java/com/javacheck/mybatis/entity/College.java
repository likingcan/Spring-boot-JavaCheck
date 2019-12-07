package com.javacheck.mybatis.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import java.util.Date;
/**
 * @author: lijincan
 * @date: 2019年12月07日 16:35
 * @Description: TODO
 */
@TableName("kh_college")
@Data
public class College {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    private String name;
    private String leadername;
    private String leaderphone;
    private String comment;
    private String create_by;
    private Date create_date;
    private String update_by;
    private Date update_date;
    private String remarks;
    private String del_flag;
}
