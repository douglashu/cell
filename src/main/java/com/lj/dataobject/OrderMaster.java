package com.lj.dataobject;

import com.lj.emnus.OrderStatusEnum;
import com.lj.emnus.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /* 订单id */
    @Id
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
    /* 创建时间 */
    private Date createTime;
    /* 修改时间 */
    private Date updateTime;

    public OrderMaster() {
        super();
    }

    public OrderMaster(String orderId, String buyerName, String buyerPhone, String buyerAddress, String buyerOpenid, BigDecimal orderAmount, Integer orderStatus, Integer payStatus, Date createTime, Date updateTime) {
        this.orderId = orderId;
        this.buyerName = buyerName;
        this.buyerPhone = buyerPhone;
        this.buyerAddress = buyerAddress;
        this.buyerOpenid = buyerOpenid;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
        this.payStatus = payStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
