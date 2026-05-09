package com.order.mapper;
/*
package com.order.mapper;

import com.order.entity.Order;
import com.order.model.request.OrderRequest;
import com.order.model.response.OrderResponse;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toEntity(OrderRequest orderRequest);

    OrderResponse toResponse(Order order);

    List<OrderResponse> toResponseList(List<Order> orders);

    void updateEntity(Order existingOrder, OrderRequest request);
}
*/

import com.order.entity.Order;
import com.order.model.request.OrderRequest;
import com.order.model.response.OrderResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "time", target = "time")
    @Mapping(source = "days", target = "days")
    @Mapping(source = "address", target = "address")
    Order toEntity(OrderRequest orderRequest);

    OrderResponse toResponse(Order order);

    List<OrderResponse> toResponseList(List<Order> orders);

    void updateEntity(@MappingTarget Order existingOrder, OrderRequest request);
}