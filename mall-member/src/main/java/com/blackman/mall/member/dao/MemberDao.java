package com.blackman.mall.member.dao;

import com.blackman.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author BlackMan
 * @email lujun19950@gmail.com
 * @date 2023-02-22 11:11:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
