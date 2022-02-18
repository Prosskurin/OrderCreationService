package com.proskurin.mvc.order.service;

import com.proskurin.mvc.order.dao.OrderDao;
import com.proskurin.mvc.order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;


    @Override
    @Transactional
    public void saveOrder(Order order) {
        orderDao.saveOrder(order);
    }

    @Override
    @Transactional
    public void addId(int id) {
        orderDao.addId(id);

    }


}
