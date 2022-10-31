package com.moshui.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moshui.common.utils.PageUtils;
import com.moshui.guli.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author moshui
 * @email 2449952049@qq.com
 * @date 2022-10-31 10:07:36
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

