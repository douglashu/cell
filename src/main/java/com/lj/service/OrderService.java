package com.lj.service;

import com.lj.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {
    /* 创建订单 */
    OrderDTO create(OrderDTO orderDTO);

    /* 查询单个订单详情 */
    OrderDTO findOne(String orderId);

    /* 查询订单总列表(买家用) */
    Page<OrderDTO> findList(String buyerOpenid);

    /* 取消订单 */
    OrderDTO cancel(OrderDTO orderDTO);

    /* 完结订单 */
    OrderDTO finish(OrderDTO orderDTO);

    /* 支付订单 */
    OrderDTO paid(OrderDTO orderDTO);

    /* 查询订单列表(卖家管理系统用) */
    Page<OrderDTO> findList(Pageable pageable);

}
