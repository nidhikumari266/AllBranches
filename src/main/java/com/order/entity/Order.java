package com.order.entity;

import com.order.enumpac.DAYS;
import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "order_Name")
    private String name;

    @Column(name="Date")
    private  String date;

    @Column(name = "time")
    private String time;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="days")
    private DAYS days;

    @Column(name ="address")
    private String address;

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", days=" + days +
                ", address='" + address + '\'' +
                '}';
    }
}
