package com.order.resources;


import com.order.model.request.OrderRequest;
import com.order.model.response.OrderResponse;
import com.order.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<String> save(@Valid @RequestBody OrderRequest request) {
        String response = orderService.save(request);
        System.out.println( "response " + response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public List<OrderResponse> getOrderList(){
        List<OrderResponse> orderList = orderService.findAll();
        return orderList;
    }

    @GetMapping("/id")
    public OrderResponse getOrderById(@RequestParam("id") Long id){
        OrderResponse OrdersResponse = orderService.findById(id);
        return OrdersResponse;
    }


    @PutMapping("/{id}")
    public ResponseEntity<OrderResponse> updateOrder(
            @PathVariable Long id,
            @Valid @RequestBody OrderRequest request) {
        OrderResponse response = orderService.update(id, request);
        return ResponseEntity.ok(response);
    }

}
