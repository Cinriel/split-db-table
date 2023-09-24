package com.wxy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("product_descript")
public class ProductDescript {
    @TableId
    private Long id;

    private Long productInfoId;

    private String descript;

    private Long storeInfoId;  // 店铺id
}
