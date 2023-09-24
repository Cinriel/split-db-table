package com.wxy;

import com.wxy.entity.StoreInfo;
import com.wxy.mapper.StoreInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StoreInfoTest {
    @Autowired
    private StoreInfoMapper infoMapper;

    @Test
    public void testInsert() {
        StoreInfo storeInfo = new StoreInfo();
        storeInfo.setStoreName("XXX");
        storeInfo.setReputation(4);
        storeInfo.setRegionCode("110100");
        infoMapper.insert(storeInfo);
    }
}
