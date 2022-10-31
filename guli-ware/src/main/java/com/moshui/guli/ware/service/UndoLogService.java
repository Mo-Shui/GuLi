package com.moshui.guli.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moshui.common.utils.PageUtils;
import com.moshui.guli.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author moshui
 * @email 2449952049@qq.com
 * @date 2022-10-31 21:30:37
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

