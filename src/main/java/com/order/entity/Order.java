package com.order.entity;

import com.order.enumpac.DAYS;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Order_Table")
public class Order {

    @Id
    @Column(name = "order_Id")
    private int orderId;

    @Column(name = "order_Name")
    private String name;

    @Column(name="Date")
    private  String date;

    @Column(name = "time")
    private String time;

    @Column(name="days")
    private DAYS days;

    @Column(name ="address")
    private String address;

}
