package com.project.merchant.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="merchant")
public class Merchant {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private String id;

    @Column(name="id_merchant_type")
    private String idMerchantType;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="owner")
    private String owner;

    @Column(name="bardcode")
    private String bardcode;

    @Column(name="created_date")
    private LocalDateTime createdDate;
}
