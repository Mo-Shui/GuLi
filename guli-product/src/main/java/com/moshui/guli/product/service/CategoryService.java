package com.moshui.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moshui.common.utils.PageUtils;
import com.moshui.guli.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author moshui
 * @email 2449952049@qq.com
 * @date 2022-10-31 10:07:37
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

