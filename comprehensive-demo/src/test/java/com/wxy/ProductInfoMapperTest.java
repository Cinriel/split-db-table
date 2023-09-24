package com.wxy;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wxy.entity.ProductInfo;
import com.wxy.mapper.ProductInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class ProductInfoMapperTest {
    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Test
    public void testInsert() {
        for (int i = 0; i < 10; i++) {
            ProductInfo productInfo = new ProductInfo();
            productInfo.setProductName("test");
            productInfo.setSpec("test");
            productInfo.setPrice(new BigDecimal("1.99"));
            productInfo.setRegionCode("110100");
            productInfo.setImageUrl("http://www.baidu.com");
            productInfo.setStoreInfoId((long) i);
            productInfoMapper.insert(productInfo);
        }

    }

    @Test
    public void testSelect() {
        LambdaQueryWrapper<ProductInfo> query = Wrappers.lambdaQuery();
        query.eq(ProductInfo::getStoreInfoId, 3);
        List<ProductInfo> selectList = productInfoMapper.selectList(null);
        System.out.println(selectList.size());
    }
}
