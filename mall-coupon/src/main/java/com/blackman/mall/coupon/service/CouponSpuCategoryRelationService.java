package com.blackman.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackman.common.utils.PageUtils;
import com.blackman.mall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author BlackMan
 * @email lujun19950@gmail.com
 * @date 2023-02-22 10:59:13
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

