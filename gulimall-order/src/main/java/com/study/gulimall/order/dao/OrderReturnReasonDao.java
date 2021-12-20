package com.study.gulimall.order.dao;

import com.study.gulimall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author jinpeng
 * @email jp170518@gmail.com
 * @date 2021-12-20 00:32:26
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
