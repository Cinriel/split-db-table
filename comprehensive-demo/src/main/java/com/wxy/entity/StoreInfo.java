package com.wxy.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("store_info")
public class StoreInfo {
    @TableId
    private Long id;

    private String storeName;

    private Integer reputation;

    private String regionCode;
}
