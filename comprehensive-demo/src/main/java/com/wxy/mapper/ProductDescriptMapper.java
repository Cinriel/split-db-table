package com.wxy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxy.entity.ProductDescript;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductDescriptMapper extends BaseMapper<ProductDescript> {
}
