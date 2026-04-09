package com.order.service;


import com.order.model.request.OrderRequest;
import com.order.model.response.OrderResponse;
import jakarta.validation.Valid;

import java.util.List;

public interface OrderService {

    String save(OrderRequest request);

    List<OrderResponse> findAll();

    OrderResponse findById(Long id);

    OrderResponse update(Long id, @Valid OrderRequest request);
}
