package com.order.service.serviceImpl;

import com.order.entity.Order;
import com.order.mapper.OrderMapper;
import com.order.model.request.OrderRequest;
import com.order.model.response.OrderResponse;
import com.order.repository.OrderRepository;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceIMpl implements OrderService {

    @Autowired
    private OrderRepository  orderRepository;

    @Autowired
    private OrderMapper  orderMapper;


    @Override
    public String save(OrderRequest orderRequest) {

        System.out.println("OrderServiceIMpl save" + orderRequest);
        Order order = orderMapper.toEntity(orderRequest);
        System.out.println( " ************* order "  + order);
        orderRepository.save(order);
        return "Order saved successfully";
    }



    @Override
    public List<OrderResponse> findAll() {
        return orderMapper.toResponseList(orderRepository.findAll());
    }

    @Override
    public OrderResponse findById(Long id) {
        Order order = orderRepository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new RuntimeException("Order not found"));
        return orderMapper.toResponse(order);
    }

    @Override
    public OrderResponse update(Long id, OrderRequest request) {
        Order existingOrder = orderRepository.findById(Math.toIntExact(id))
                .orElseThrow(() -> new RuntimeException("Order not found"));
        orderMapper.updateEntity(existingOrder, request);
        Order updatedOrder = orderRepository.save(existingOrder);
        return orderMapper.toResponse(updatedOrder);
    }

}
