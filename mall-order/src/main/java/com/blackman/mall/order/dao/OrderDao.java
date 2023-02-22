package com.blackman.mall.order.dao;

import com.blackman.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author BlackMan
 * @email lujun19950@gmail.com
 * @date 2023-02-17 20:29:26
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
