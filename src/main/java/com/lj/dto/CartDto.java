package com.lj.dto;

import lombok.Data;

/**
 * 购物车
 */
@Data
public class CartDto {

    /* 商品Id */
    private String productId;
    /* 数量 */
    private Integer productQuantity;

    public CartDto(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
