package com.lj.service.impl;


import com.lj.dto.OrderDTO;
import com.lj.service.OrderService;
import com.lj.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductInfoService productInfoService;

    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }
}
