package com.moshui.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moshui.common.utils.PageUtils;
import com.moshui.guli.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author moshui
 * @email 2449952049@qq.com
 * @date 2022-10-31 10:07:37
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

