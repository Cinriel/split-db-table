package com.wxy.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wxy.pojo.Dict;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DictDaoTest {
    @Autowired
    private DictDao dictDao;

    @Test
    public void testInsert() {
        Dict dict = new Dict();
        dict.setCode("404");
        dict.setValue("not found");
        dict.setType("http");
        dictDao.insert(dict);
    }

    @Test
    public void testDelete() {
        LambdaQueryWrapper<Dict> query = Wrappers.lambdaQuery();
        query.eq(Dict::getCode, "200");
        dictDao.delete(query);
    }
}
