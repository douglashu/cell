package com.lj.emnus;

import lombok.Getter;

@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(0, "商品不存在"),
    PRODUCT_STOCK_ERROR(1, "库存不正确"),
    ORDER_NOT_EXIST(2, "订单不存在"),
    ORDERDETAIL_NOT_EXIST(3, "订单详情不存在"),
    ORDER_STATUS_ERROR(4, "订单状态不正确"),
    ORDER_UPDATE_FAIL(5, "订单更新失败"),
    ORDER_DETAIL_EMPTY(6, "订单详情为空"),
    ORDER_PAY_STATUS_ERROR(7, "订单支付状态不正确");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
