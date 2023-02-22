package com.blackman.mall.ware.dao;

import com.blackman.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author BlackMan
 * @email lujun19950@gmail.com
 * @date 2023-02-22 11:21:06
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
