package com.lj.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lj.dataobject.OrderDetail;
import com.lj.emnus.OrderStatusEnum;
import com.lj.emnus.PayStatusEnum;
import com.lj.utils.EnumUtil;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO implements Serializable {
    private static final long serialVersionUID = 1314L;

    /* 订单id */
    private String orderId;
    /* 买家名字 */
    private String buyerName;
    /* 买家电话 */
    private String buyerPhone;
    /* 买家地址 */
    private String buyerAddress;
    /* 买家微信openid */
    private String buyerOpenid;
    /* 订单总金额 */
    private BigDecimal orderAmount;
    /* 订单状态，默认0新订单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /* 支付状态，默认0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    //创建时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    //更新时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    //@Transient//为了方便关联订单总表和详情表，把此字段加在这.用此注解就可以让程序在与数据库关联时忽略此字段,但是更规范的写法就是创建新的DTO
    private List<OrderDetail> orderDetailList; //= new ArrayList<>();(配置中配置了如果为null就不返回)

    @JsonIgnore//在返回json的时候回忽略这个属性
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }


}
