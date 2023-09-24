package com.wxy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxy.entity.Region;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RegionMapper extends BaseMapper<Region> {
}
