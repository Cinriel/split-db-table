package com.wxy.dao;

import com.wxy.pojo.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class OrderDaoTest {
    @Autowired
    private OrderDao orderDao;

    @Test
    public void testInsert() {
        Order order = new Order();
        for (int i = 0; i < 10; i++) {
            order.setOrderId(null);
            order.setOrderName("test-order:" + i);
            order.setCreateTime(new Date());
            orderDao.insert(order);
        }
    }
}
