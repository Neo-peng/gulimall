package com.study.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.common.utils.PageUtils;
import com.study.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author jinpeng
 * @email jp170518@gmail.com
 * @date 2021-12-20 00:32:26
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

