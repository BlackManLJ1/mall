package com.blackman.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackman.common.utils.PageUtils;
import com.blackman.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author BlackMan
 * @email lujun19950@gmail.com
 * @date 2023-02-22 11:11:32
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

