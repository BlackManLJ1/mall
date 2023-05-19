package com.blackman.mall.product.dao;

import com.blackman.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author BlackMan
 * @email lujun19950@gmail.com
 * @date 2023-02-17 17:34:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

    Long selectCountByParentCid(Long parentCid);
	
}
