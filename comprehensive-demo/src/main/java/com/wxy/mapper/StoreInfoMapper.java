package com.wxy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxy.entity.StoreInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StoreInfoMapper extends BaseMapper<StoreInfo> {
}
