package com.moshui.guli.order.dao;

import com.moshui.guli.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author moshui
 * @email 2449952049@qq.com
 * @date 2022-10-31 21:24:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
