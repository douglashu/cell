package com.lj.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private List<ProductInfoVO> data;
}
