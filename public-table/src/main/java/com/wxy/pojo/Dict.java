package com.wxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_dict")
public class Dict {
    @TableId(type = IdType.ASSIGN_ID)
    private Long dictId;
    private String type;
    private String code;
    private String value;
}
