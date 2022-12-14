package com.moshui.guli.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moshui.common.utils.PageUtils;
import com.moshui.guli.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author moshui
 * @email 2449952049@qq.com
 * @date 2022-10-31 20:45:24
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

