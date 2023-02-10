package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lyl
 * @email lyl@gmail.com
 * @date 2023-02-07 11:44:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
