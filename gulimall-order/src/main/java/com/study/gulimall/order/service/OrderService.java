package com.study.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.common.utils.PageUtils;
import com.study.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author jinpeng
 * @email jp170518@gmail.com
 * @date 2021-12-20 00:32:26
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

