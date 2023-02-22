package com.blackman.mall.coupon.dao;

import com.blackman.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author BlackMan
 * @email lujun19950@gmail.com
 * @date 2023-02-22 10:59:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
