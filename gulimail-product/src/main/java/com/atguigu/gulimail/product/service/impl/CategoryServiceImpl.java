package com.atguigu.gulimail.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimail.product.dao.CategoryDao;
import com.atguigu.gulimail.product.entity.CategoryEntity;
import com.atguigu.gulimail.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> queryListTree() {
        List<CategoryEntity> list = categoryDao.selectList(null);
        List<CategoryEntity> collect = list.stream().filter(
                category -> category.getParentCid() == 0
        ).map(
                categoryEntity -> {
                    categoryEntity.setChildrenList(getCategoryChildren(categoryEntity, list));
                    return categoryEntity;
                }
        ).collect(Collectors.toList());
        return collect;
    }

    private List<CategoryEntity> getCategoryChildren(CategoryEntity categoryEntity, List<CategoryEntity> list) {

        List<CategoryEntity> list1 = list.stream().filter(
                entity -> entity.getParentCid() == categoryEntity.getCatId()
        ).map(
                entity -> {
                    entity.setChildrenList(getCategoryChildren(entity, list));
                    return entity;
                }
        ).collect(Collectors.toList());
        return list1;
    }


}