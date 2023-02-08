package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.UmsMemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lyl
 * @email lyl@gmail.com
 * @date 2023-02-07 16:21:17
 */
@Mapper
public interface UmsMemberDao extends BaseMapper<UmsMemberEntity> {
	
}
