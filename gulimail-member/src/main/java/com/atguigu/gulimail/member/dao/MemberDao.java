package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lyl
 * @email lyl@gmail.com
 * @date 2023-02-07 16:36:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
