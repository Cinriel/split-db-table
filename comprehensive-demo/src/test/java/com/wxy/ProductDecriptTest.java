package com.wxy;

import com.wxy.entity.ProductDescript;
import com.wxy.mapper.ProductDescriptMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductDecriptTest {
    @Autowired
    private ProductDescriptMapper mapper;

    @Test
    public void testInsert() {
        ProductDescript descript = new ProductDescript();
        descript.setDescript("testestsetset");
        descript.setStoreInfoId(2L);
        descript.setProductInfoId(1705805167610884098L);
        mapper.insert(descript);
    }

    @Test
    public void testSelect() {
        System.out.println(mapper.selectCount(null));
    }
}
