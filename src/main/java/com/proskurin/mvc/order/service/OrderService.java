package com.proskurin.mvc.order.service;

import com.proskurin.mvc.order.entity.Order;

public interface OrderService {

    public void saveOrder(Order order);

    public void addId(int id);

}
