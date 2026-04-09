package com.order.model.response;

import com.order.enumpac.DAYS;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OrderResponse {

    private int orderId;

    private String name;

    private  String date;

    private String time;

    private DAYS days;

    private String address;
}
