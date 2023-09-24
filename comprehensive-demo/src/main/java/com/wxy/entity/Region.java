package com.wxy.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("region")
public class Region {
    @TableId
    private Long id;

    private String regionCode;

    private String regionName;

    private Integer level;

    private String parentRegionCode;
}
