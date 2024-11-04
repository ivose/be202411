package ee.ivo.veebipood.controller;

import ee.ivo.veebipood.entity.Order;
import ee.ivo.veebipood.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("orders")
    public List<Order> addOrder(@RequestBody Order order) {
        order.setCreation(new java.util.Date());
        order.setTotalSum(100);
        orderRepository.save(order);
        return orderRepository.findAll();
    }
}
