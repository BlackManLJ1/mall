package com.blackman.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackman.common.utils.PageUtils;
import com.blackman.mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author BlackMan
 * @email lujun19950@gmail.com
 * @date 2023-02-22 10:59:13
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

