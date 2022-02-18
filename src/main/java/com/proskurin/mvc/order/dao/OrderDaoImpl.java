package com.proskurin.mvc.order.dao;

import com.proskurin.mvc.order.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveOrder(Order order) {

        Session session = sessionFactory.getCurrentSession();

        session.save(order);
    }

    @Override
    public void addId(int id) {

        Session session = sessionFactory.getCurrentSession();
        Query<Order> query = session.createQuery("select id from Order where id=:ordId");
        query.setParameter("ordId", id);

    }


}
