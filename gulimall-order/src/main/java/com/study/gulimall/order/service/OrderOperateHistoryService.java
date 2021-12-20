package com.study.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.common.utils.PageUtils;
import com.study.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author jinpeng
 * @email jp170518@gmail.com
 * @date 2021-12-20 00:32:26
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

