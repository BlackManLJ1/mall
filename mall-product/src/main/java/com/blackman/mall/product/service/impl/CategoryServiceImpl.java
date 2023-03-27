package com.blackman.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blackman.common.utils.PageUtils;
import com.blackman.common.utils.Query;

import com.blackman.mall.product.dao.CategoryDao;
import com.blackman.mall.product.entity.CategoryEntity;
import com.blackman.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> queryCategoryTree() {
        // 1.从数据库中查找出所有的分类信息
        // 查出所有(包括一级、二级、三级等等)的分类信息
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        // 2.1首先找出第一级分类 标志为parent_cid=0
        // 2.2 查找二级分类
        List<CategoryEntity> leve1Menu = categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0L)
                .map((menu) -> {
                    menu.setChildren(getChildrenTree(menu, categoryEntities));
                    return menu;
                }).sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                }).collect(Collectors.toList());
        return leve1Menu;
    }

    @Override
    public void removeMenusByIds(Long[] catIds) {
        //TODO 需判断在那些情况下不能进行删除

        // 逻辑删除的sql：update pms_category set show_status = 0 where cat_id in () and show_status = 1;
        baseMapper.deleteBatchIds(Arrays.asList(catIds));
    }

    /**
     *  查找出子菜单 如二级菜单、三级菜单等
     * @param root 当前菜单的
     * @param all 所有菜单集合
     * @return 返回当前菜单下的所有子菜单集合
     */
    private List<CategoryEntity> getChildrenTree(CategoryEntity root,  List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(category -> (category.getParentCid() == root.getCatId()))
                .map(menu -> {
                    menu.setChildren(getChildrenTree(menu, all));
                    return menu;
                }).sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                }).collect(Collectors.toList());
        return children;
    }

}