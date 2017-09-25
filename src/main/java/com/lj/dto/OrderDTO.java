package com.lj.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lj.dataobject.OrderDetail;
import com.lj.emnus.PayStatusEnum;
import com.lj.utils.EnumUtil;
import com.lj.emnus.OrderStatusEnum;
import com.lj.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    /* 订单id*/
    private String orderId;
    /* 买家名字 */
    private String buyerName;
    /* 买家手机号 */
    private String buyerPhone;
    /* 卖家地址 */
    private String buyerAddress;
    /* 买家微信Openid */
    private String buyerOpenid;
    /* 订单总金额 */
    private BigDecimal orderAmount;
    /* 订单状态，默认0新订单 */
    private Integer orderStatus;
    /* 支付状态，默认0未支付 */
    private Integer payStatus;
    /* 创建时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    /* 更新时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }

}
