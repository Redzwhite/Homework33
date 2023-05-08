package com.example.homework.controller;

import com.example.homework.model.Order;
import com.example.homework.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable long id) {
        return orderRepository.getOrderById(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order addOrder(@RequestBody Order order) {
        return orderRepository.addOrder(order);
    }
}
