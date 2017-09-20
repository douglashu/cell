package com.lj.service;

import com.lj.dataobject.OrderMaster;

public interface OrderService {
    OrderMaster findOne(String orderId);
}
