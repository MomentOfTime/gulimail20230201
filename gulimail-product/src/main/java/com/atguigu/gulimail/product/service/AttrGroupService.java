package com.atguigu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author lyl
 * @email lyl@gmail.com
 * @date 2023-02-07 11:44:12
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

