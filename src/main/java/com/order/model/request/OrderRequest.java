package com.order.model.request;

import com.order.enumpac.DAYS;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OrderRequest {

    private int orderId;

    private String name;

    @NotBlank
    private  String date;

    private String time;

    private DAYS days;

    @NotBlank
    private String address;
}
