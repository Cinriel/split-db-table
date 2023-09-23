package com.wxy.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxy.pojo.Order;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface OrderDao extends BaseMapper<Order> {

    /*int insertOrder(@Param("price") BigDecimal price, @Param("userId") long userId, @Param("status") String status);

    @MapKey("order_id")
    List<Map<String, Object>> selectOrderByIds(@Param("ids") List<Long> ids);*/

}
