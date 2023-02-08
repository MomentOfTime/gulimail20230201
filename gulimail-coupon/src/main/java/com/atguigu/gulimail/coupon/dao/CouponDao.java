package com.atguigu.gulimail.coupon.dao;

import com.atguigu.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lyl
 * @email lyl@gmail.com
 * @date 2023-02-07 15:55:01
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
