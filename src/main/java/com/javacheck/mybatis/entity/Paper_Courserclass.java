package com.javacheck.mybatis.entity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import java.util.Date;
/**
 * @author: lijincan
 * @date: 2019年12月07日 16:18
 * @Description: TODO
 */
@TableName("kh_paper_courserclass")
@Data
public class Paper_Courserclass {

    private int testpaper_id;
    private int courserclass_id;
    private Date start_time;
    private Date end_time;
    private String comment;
    private String create_by;
    private Date create_date;
    private String update_by;
    private Date update_date;
    private String remarks;
    private String del_flag;
}
