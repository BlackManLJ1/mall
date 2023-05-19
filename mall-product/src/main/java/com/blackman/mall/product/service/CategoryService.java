package com.blackman.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackman.common.utils.PageUtils;
import com.blackman.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author BlackMan
 * @email lujun19950@gmail.com
 * @date 2023-02-17 17:34:53
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> queryCategoryTree();

    void removeMenusById(Integer[] ids);
}

