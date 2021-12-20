package com.study.gulimall.order;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.gulimall.order.entity.OrderEntity;
import com.study.gulimall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    void contextLoads() {
//        OrderEntity orderEntity = new OrderEntity();
//        orderEntity.setId(1L);
//        orderEntity.setBillContent("bill content");
//        orderEntity.setOrderSn("order sn");
////        orderService.save(orderEntity);
//        orderService.updateById(orderEntity);
//        System.out.println("update成功");

        List<OrderEntity> list = orderService.list(new QueryWrapper<OrderEntity>().eq("id", 1L));
        list.forEach(item -> {
            System.out.println(item );
        });
    }
}
