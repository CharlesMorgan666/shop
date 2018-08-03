package com.mcl.shop.service;

import com.mcl.shop.pojo.*;

import java.util.List;

/**
 * @author 莫昌廉
 */
public interface IOrderService {
    public void insertOrder(Order order);

    public void deleteById(Integer orderid);


    public List<Order> selectOrderByExample(OrderExample orderExample);

    public List<OrderItem> getOrderItemByExample(OrderItemExample orderItemExample);

    public Address getAddressByKey(Integer addressid);

    public void updateOrderByKey(Order order);

    public Order selectByPrimaryKey(Integer orderid);

    void insertOrderItem(OrderItem orderItem);
}
