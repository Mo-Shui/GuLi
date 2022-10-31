package com.moshui.guli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moshui.common.utils.PageUtils;
import com.moshui.guli.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author moshui
 * @email 2449952049@qq.com
 * @date 2022-10-31 21:24:36
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

