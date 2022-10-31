package com.moshui.guli.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moshui.common.utils.PageUtils;
import com.moshui.guli.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author moshui
 * @email 2449952049@qq.com
 * @date 2022-10-31 20:45:24
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

