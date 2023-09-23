package com.wxy.dao;

import com.wxy.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testInsert() {
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUserType("1");
            user.setFullname("张三" + i);
            userDao.insert(user);
        }
    }

    @Test
    public void testSelect() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
        System.out.println(userDao.selectById(1L));
    }

}
