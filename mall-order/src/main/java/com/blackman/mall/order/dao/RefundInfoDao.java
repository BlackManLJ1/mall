package com.blackman.mall.order.dao;

import com.blackman.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author BlackMan
 * @email lujun19950@gmail.com
 * @date 2023-02-17 20:29:26
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
