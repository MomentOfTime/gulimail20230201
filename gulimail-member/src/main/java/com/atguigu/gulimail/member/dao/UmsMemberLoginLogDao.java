package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.UmsMemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author lyl
 * @email lyl@gmail.com
 * @date 2023-02-07 16:21:17
 */
@Mapper
public interface UmsMemberLoginLogDao extends BaseMapper<UmsMemberLoginLogEntity> {
	
}
