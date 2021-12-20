package com.study.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.common.utils.PageUtils;
import com.study.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author jinpeng
 * @email jp170518@gmail.com
 * @date 2021-12-20 00:32:26
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

