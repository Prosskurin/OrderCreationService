package com.proskurin.mvc.order.dao;

import com.proskurin.mvc.order.entity.Order;

public interface OrderDao {

    public void saveOrder(Order order);

    public void addId(int id);
}
