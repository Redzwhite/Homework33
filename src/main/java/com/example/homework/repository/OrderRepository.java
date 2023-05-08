package com.example.homework.repository;
import com.example.homework.model.Order;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrderRepository {

    private Map<Long, Order> orders = new HashMap<>();
    private long nextId = 1;

    public Order getOrderById(long id) {
        return orders.get(id);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }

    public Order addOrder(Order order) {
        order.setId(nextId++);
        orders.put(order.getId(), order);
        return order;
    }
}





