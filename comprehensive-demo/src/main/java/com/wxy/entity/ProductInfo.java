package com.wxy.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("product_info")
public class ProductInfo {
    @TableId
    private Long productInfoId;

    private Long storeInfoId;  // 店铺id

    private String productName;

    private String spec;

    private String regionCode;

    private BigDecimal price;

    private String imageUrl;

}
