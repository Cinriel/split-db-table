package com.wxy.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wxy.pojo.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class OrderDaoTest {
    @Autowired
    private OrderDao orderDao;

    /*@Test
    public void testInsert() {
        for (int i = 0; i < 10; i++) {
            int j = orderDao.insertOrder(new BigDecimal("1.2"), i, "1");
            System.out.println(j);
        }
    }

    @Test
    public void testSelectByIds() {
        List<Map<String, Object>> res = orderDao.selectOrderByIds(Arrays.asList(912342829294944256L, 912342829429161984L,912342829362053121L));
        System.out.println(res);

    }*/

    @Test
    public void testInsert() {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setStatus("1");
            order.setPrice(new BigDecimal("1.7"));
            order.setUserId(1390L);
            orderDao.insert(order);
        }
    }

    @Test
    public void testUpdate() {
        Order order = new Order();
        order.setOrderId(1705472806138441729L);
        order.setUserId(1578L);
        order.setPrice(new BigDecimal("1.99"));
        orderDao.updateById(order);
    }

    @Test
    public void testSelect() {
        LambdaQueryWrapper<Order> query = Wrappers.lambdaQuery();
        query.gt(Order::getOrderId, 1695452488162L);
        List<Order> orders = orderDao.selectList(query);
        System.out.println(orders);
    }
}
