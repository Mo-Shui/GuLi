package com.moshui.guli.member.dao;

import com.moshui.guli.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author moshui
 * @email 2449952049@qq.com
 * @date 2022-10-31 21:05:04
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
