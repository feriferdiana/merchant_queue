package com.project.merchant.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="merchant_queue")
public class MerchantQueue {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private String id;

    @Column(name="id_merchant")
    private String idMerchant;

    @Column(name="order_datetime")
    private LocalDateTime orderDatetime;

    @Column(name="order_queue")
    private Integer orderQueue;

    @Column(name="created_date")
    private LocalDateTime createdDate;
}
